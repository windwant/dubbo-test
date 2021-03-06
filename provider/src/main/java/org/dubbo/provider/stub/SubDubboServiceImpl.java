package org.dubbo.provider.stub;

import org.dubbo.common.StubDubboService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 18-4-4.
 */
@Service("stubDubboService")
public class SubDubboServiceImpl implements StubDubboService {
    @Override
    public String hello(String name) {
        return "stub " + name;
    }

    @Override
    public String testMock(String name) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "";
    }
}
