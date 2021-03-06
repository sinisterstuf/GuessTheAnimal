package org.sinisterstuf.guesstheanimal.ui;

import android.app.Activity;
import android.os.Bundle;

import org.sinisterstuf.guesstheanimal.Animal;
import org.sinisterstuf.guesstheanimal.Game;
import org.sinisterstuf.guesstheanimal.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lose);
		ButterKnife.bind(this);
	}

	@OnClick(R.id.okButton)
	public void startNewGame() {
		GuessActivity.start(this);
	}

}
