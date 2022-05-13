package com.task.ui.base

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.task.PriceFormatter
import javax.inject.Inject

/**
 * Created by AhmedEltaher
 */


abstract class BaseActivity : AppCompatActivity() {

    @Inject
    val mPriceFormatter: PriceFormatter

    abstract fun observeViewModel()
    protected abstract fun initViewBinding()
    lateinit var exception:Exception

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
        observeViewModel()
        exception.cause
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
