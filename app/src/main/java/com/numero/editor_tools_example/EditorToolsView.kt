package com.numero.editor_tools_example

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.view_editor_tools.view.*

class EditorToolsView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        View.inflate(context, R.layout.view_editor_tools, this)

        setupClickListener()
    }

    private fun setupClickListener() {
        guideImageButton.setOnClickListener {
            if (motionLayout.progress > 0.5f) {
                motionLayout.transitionToStart()
            } else {
                motionLayout.transitionToEnd()
            }
        }
    }

}
