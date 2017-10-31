package com.joshua.knights.config;

import com.joshua.knights.BraveKnight;
import com.joshua.knights.Knight;
import com.joshua.knights.Quest;
import com.joshua.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by joshua on 2017/10/31.
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    private Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
