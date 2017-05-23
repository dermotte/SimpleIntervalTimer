package simpleintervaltimer.tools.juggle.at.simpleintervaltimer;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.webkit.JavascriptInterface;

/**
 * Created by mlux on 23.05.2017.
 */

public class WebAppInterface {

        TextToSpeech tts;

        /** Instantiate the interface and set the context */
        WebAppInterface(TextToSpeech tts) {
            this.tts = tts;
        }

        /** Speak up from JavaScript */
        @JavascriptInterface
        public void announceWorkout(String announcement) {
            tts.speak(announcement, TextToSpeech.QUEUE_FLUSH, null, announcement+System.currentTimeMillis());
        }
}
