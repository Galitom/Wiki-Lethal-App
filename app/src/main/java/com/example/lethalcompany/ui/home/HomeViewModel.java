package com.example.lethalcompany.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("I giocatori hanno il compito di raccogliere rottami dalle lune abbandonate e industrializzate, evitando trappole, pericoli ambientali e mostri. Si tratta di dipendenti a contratto che lavorano per \"L'Azienda\" e ricevono periodi di tre giorni per soddisfare la quota di profitto in costante aumento.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}