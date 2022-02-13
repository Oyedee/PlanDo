package com.example.plando.data.models


import androidx.compose.ui.graphics.Color
import com.example.plando.ui.theme.HighPriorityColor
import com.example.plando.ui.theme.LowPriorityColor
import com.example.plando.ui.theme.MediumPriorityColor
import com.example.plando.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}