package com.triman.challengechapter4.model.user

import com.triman.challengechapter4.data.HandType
import com.triman.challengechapter4.model.engine.PlayerEngine

class Bot : PlayerEngine() {

    override var playerHand : String = ""

    fun getRandomHandBot () : String{
        return arrayOf(
            HandType.ROCK.hand,
            HandType.SCISSOR.hand,
            HandType.PAPER.hand
        ).random()
    }
}