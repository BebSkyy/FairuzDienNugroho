package org.d3if3133.myapplication.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if3133.myapplication.database.CatatanDao
import org.d3if3133.myapplication.ui.screen.MainViewModel
import org.d3if3133.myapplication.ui.screen.AboutViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory (
    private val dao: CatatanDao
) : ViewModelProvider.Factory{
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(dao) as T
        } else if (modelClass.isAssignableFrom(AboutViewModel::class.java)){
            return AboutViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}