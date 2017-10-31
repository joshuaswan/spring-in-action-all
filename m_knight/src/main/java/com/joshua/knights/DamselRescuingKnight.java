package com.joshua.knights;

/**
 * Created by joshua on 2017/10/31.
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
