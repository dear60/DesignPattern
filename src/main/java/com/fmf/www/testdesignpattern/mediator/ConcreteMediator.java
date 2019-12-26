package com.fmf.www.testdesignpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fmf
 * @version 1.0
 * @className ConcreteMediator
 * @description 具体中介者角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个
 * 同事角色之间的交互关系，因此它依赖于同事角色。
 * @create 2019-07-29 15:56
 **/
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagueList = new ArrayList<Colleague>();
    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            // 建立双向联系
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagueList) {
            if (!c.equals(colleague)) {
                c.receive();
            }
        }
    }
}
