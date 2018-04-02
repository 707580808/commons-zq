package com.middle.ware.zk;

import org.apache.curator.RetryPolicy;

/**
 * Created by zhuqiang on 17/3/14.
 */
public class ZookeeperConfiguration {
    private String connectString;
    private int sessionTimeOut=20000;
    private int connectionTimeOut=150000;
    private RetryPolicy retryPolicy=new ZookeeperRetryForever(3000);

    public ZookeeperConfiguration() {
    }

    public String getConnectString() {
        return connectString;
    }

    public void setConnectString(String connectString) {
        this.connectString = connectString;
    }

    public int getSessionTimeOut() {
        return sessionTimeOut;
    }

    public void setSessionTimeOut(int sessionTimeOut) {
        this.sessionTimeOut = sessionTimeOut;
    }

    public int getConnectionTimeOut() {
        return connectionTimeOut;
    }

    public void setConnectionTimeOut(int connectionTimeOut) {
        this.connectionTimeOut = connectionTimeOut;
    }

    public RetryPolicy getRetryPolicy() {
        return retryPolicy;
    }

    public void setRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }
}
