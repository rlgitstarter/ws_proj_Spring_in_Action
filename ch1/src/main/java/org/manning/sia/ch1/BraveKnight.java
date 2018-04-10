package org.manning.sia.ch1;

public class BraveKnight implements Knight {
    private Quest quest;
    // Quest is injected as a constructor argument
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
