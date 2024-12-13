package com.ninjakito.dragonballdaima.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ninjakito.dragonballdaima.R
import com.ninjakito.dragonballdaima.core.models.Character

class SelectorViewModel : ViewModel() {
    private val _characters = MutableLiveData<List<Character>>(listOf(
        Character(R.string.gomah_img, R.drawable.gomah, false),
        Character(R.string.goku_img, R.drawable.goku, false),
        Character(R.string.vegeta_img, R.drawable.vegeta, false),
        Character(R.string.piccolo_img, R.drawable.piccolo, false),
        Character(R.string.supreme_img, R.drawable.supreme, false),
        Character(R.string.masked_majin_img, R.drawable.masked_majin, false),
    ))
    val characters : LiveData<List<Character>> = _characters

    private val _selectedCharacter = MutableLiveData<Character>()
    val selectedCharacter : LiveData<Character> = _selectedCharacter

    fun selectCharacter(characterID: Int) {
        for (character in _characters.value!!) {
            if (character.image == characterID) {
                character.selected = true
                _selectedCharacter.value = character
            } else {
                character.selected = false
            }
        }
    }
}