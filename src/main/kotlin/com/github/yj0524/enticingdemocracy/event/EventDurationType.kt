package com.github.yj0524.enticingdemocracy.event

sealed interface EventDurationType {
    object Permanent : EventDurationType
    object Once : EventDurationType

    class Temporary(val ticks: Int, val onEnd: (EventManager) -> Unit = {}) : EventDurationType
}