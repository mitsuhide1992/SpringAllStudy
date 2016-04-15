package com.mitsuhide.entity;

import org.springframework.stereotype.Component;

/**
 * Created by zly on 2016/4/15.
 */
@Component
public class Basketball {
    private String ballType;
    private String ballName;

    public Basketball () {
        ballName = "basketball";
        ballType = "basketball";
    }

    public String getBallType() {
        return ballType;
    }

    public void setBallType(String ballType) {
        this.ballType = ballType;
    }

    public String getBallName() {
        return ballName;
    }

    public void setBallName(String ballName) {
        this.ballName = ballName;
    }
}
