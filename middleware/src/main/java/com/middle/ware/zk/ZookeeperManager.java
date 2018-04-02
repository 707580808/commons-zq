package com.middle.ware.zk;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by zhuqiang on 17/3/14.
 */
public class ZookeeperManager {
    Map<String,ZookeeperConfiguration> resources=new HashMap<String, ZookeeperConfiguration>();
    Map<String,CuratorFramework> clients=new HashMap<String, CuratorFramework>();

    public ZookeeperManager() {
    }

    public void setResources(Map<String, ZookeeperConfiguration> resources) {
        this.resources = resources;
    }

    public CuratorFramework getClients(String key) {
        return (CuratorFramework)this.clients.get(key);
    }

    public void register(String key,ZookeeperConfiguration configuration){
        CuratorFramework curatorFramework= CuratorFrameworkFactory.newClient(configuration.getConnectString(),configuration.getSessionTimeOut(),configuration.getConnectionTimeOut(),configuration.getRetryPolicy());
        curatorFramework.start();
        this.clients.put(key,curatorFramework);
    }

    public void start(){
        Object client=null;
        ZookeeperConfiguration configuration=null;
        Iterator i$=this.resources.keySet().iterator();
        while (i$.hasNext()){
            String key=(String)i$.next();
            configuration=(ZookeeperConfiguration)this.resources.get(key);
            this.register(key,configuration);
        }
    }

    public void close(){
        if (this.clients!=null){
            Iterator i$=this.clients.values().iterator();
            while (i$.hasNext()){
                CuratorFramework curatorFramework=(CuratorFramework)i$.next();
                curatorFramework.close();
            }
        }
        this.clients=null;
    }
}
