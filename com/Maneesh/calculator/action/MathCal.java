package com.Maneesh.calculator.action;

import com.Maneesh.calculator.Numbers;
public class MathCal implements com.Maneesh.calculator.action.Cal {

    @Override
    public String add(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())+(n.getSecondNumber())));

        return add;

    }

    @Override
    public String sub(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())-(n.getSecondNumber())));
        return add;
    }

    @Override
    public String divide(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())/(n.getSecondNumber())));

        return add;
    }

    @Override
    public String mul(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())*(n.getSecondNumber())));

        return add;

    }

}
