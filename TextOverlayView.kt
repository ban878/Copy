package com.example.overlay

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class TextOverlayView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private val overlayPaint: Paint = Paint().apply {
        color = Color.BLUE
        alpha = 128 // Semi-transparent
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // Draw the blue overlay
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), overlayPaint)
    }
}