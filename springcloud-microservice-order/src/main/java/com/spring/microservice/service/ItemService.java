package com.spring.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.microservice.pojo.Item;

@Service
public class ItemService {
	// http访问
	@Autowired
	private RestTemplate restTemplate;
	
	/*public Item queryItem(Long id) {
		String url = "http://localhost:8088/item/";
		Item item = restTemplate.getForObject(url+id, Item.class);
		
		
		return item;
	}
	*/
	@Autowired
	private DiscoveryClient discoveryClient;
	
	public Item queryItemById(Long id) {
		String serviceId = "springcloud-microservice-item";
		// 返回服务列表
		List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
		if (instances == null ||instances.isEmpty()) {
			return null;
		}
		
		// 获取服务列表里面的一个服务
		ServiceInstance serviceInstance = instances.get(0);
		// 获取主机名,端口拼接url(服务地址)
		String serverUrl = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort();
		Item item = restTemplate.getForObject(serverUrl+"/item/"+id, Item.class);
		return item;
		
	}
	

}
