package com.joshua.knights;

/**
 * Created by joshua on 2017/10/31.
 */
public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
