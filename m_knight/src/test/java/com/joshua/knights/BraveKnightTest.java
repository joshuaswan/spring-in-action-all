package com.joshua.knights;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by joshua on 2017/10/31.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws Exception {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);

        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();;
    }

}