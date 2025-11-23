package com.plcoding.bookpedia.book.presentation

import androidx.lifecycle.ViewModel
import com.plcoding.bookpedia.book.domain.Book
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SelectedBookViewModel(): ViewModel() {
    private val _state = MutableStateFlow<Book?>(null)

    val state = _state.asStateFlow()

    fun onSelectBook(book: Book?) {
        _state.value = book
    }

    fun resetSelectedBook() {
        _state.value = null
    }
}