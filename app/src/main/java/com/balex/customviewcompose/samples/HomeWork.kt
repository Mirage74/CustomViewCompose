package com.balex.customviewcompose.samples

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

fun DrawScope.oleg() {
    // О
    drawCircle(
        color = Color.White,
        radius = 25.dp.toPx(),
        center = Offset(50.dp.toPx(), 50.dp.toPx()),
        style = Stroke(width = 2.dp.toPx())
    )

    // Л
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(85.dp.toPx(), 75.dp.toPx()),
        end = Offset(110.dp.toPx(), 25.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(110.dp.toPx(), 25.dp.toPx()),
        end = Offset(135.dp.toPx(), 75.dp.toPx())
    )

    //Е
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(145.dp.toPx(), 25.dp.toPx()),
        end = Offset(145.dp.toPx(), 75.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(145.dp.toPx(), 25.dp.toPx()),
        end = Offset(175.dp.toPx(), 25.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(145.dp.toPx(), 50.dp.toPx()),
        end = Offset(175.dp.toPx(), 50.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(145.dp.toPx(), 75.dp.toPx()),
        end = Offset(175.dp.toPx(), 75.dp.toPx())
    )
    //Г
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(190.dp.toPx(), 25.dp.toPx()),
        end = Offset(225.dp.toPx(), 25.dp.toPx())
    )
    drawLine(
        color = Color.White,
        strokeWidth = 2.dp.toPx(),
        start = Offset(190.dp.toPx(), 25.dp.toPx()),
        end = Offset(190.dp.toPx(), 75.dp.toPx())
    )
}

@Composable
fun House() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(colors = listOf(Color.Magenta, Color.Blue)))
    ) {
        drawPath(
            path = Path().apply {
                moveTo(100.dp.toPx(), 300.dp.toPx())
                lineTo(100.dp.toPx(), 500.dp.toPx())
                lineTo(300.dp.toPx(), 500.dp.toPx())
                lineTo(300.dp.toPx(), 300.dp.toPx())
                lineTo(200.dp.toPx(), 200.dp.toPx())
                lineTo(100.dp.toPx(), 300.dp.toPx())
                lineTo(300.dp.toPx(), 300.dp.toPx())
                moveTo(150.dp.toPx(), 350.dp.toPx())
                lineTo(250.dp.toPx(), 350.dp.toPx())
                lineTo(250.dp.toPx(), 450.dp.toPx())
                lineTo(150.dp.toPx(), 450.dp.toPx())
                lineTo(150.dp.toPx(), 350.dp.toPx())
                moveTo(200.dp.toPx(), 350.dp.toPx())
                lineTo(200.dp.toPx(), 450.dp.toPx())
                moveTo(150.dp.toPx(), 400.dp.toPx())
                lineTo(250.dp.toPx(), 400.dp.toPx())
            },
            color = Color.White,
            style = Stroke(width = 4.dp.toPx())
        )
    }
}