package com.middle.ware.zk;

import com.google.common.base.Preconditions;
import org.apache.curator.RetryPolicy;
import org.apache.curator.RetrySleeper;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhuqiang on 17/3/14.
 */
public class ZookeeperRetryForever implements RetryPolicy {
    private final int retryIntervalMs;

    public ZookeeperRetryForever(int retryIntervalMs) {
        //检查数据是否大于0如果不是抛出数据异常
        Preconditions.checkArgument(retryIntervalMs>0);
        this.retryIntervalMs = retryIntervalMs;
    }

    @Override
    public boolean allowRetry(int i, long l, RetrySleeper retrySleeper) {
        try {
            retrySleeper.sleepFor((long)this.retryIntervalMs, TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }

    }
}
