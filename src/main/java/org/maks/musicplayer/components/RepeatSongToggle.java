package org.maks.musicplayer.components;

import javafx.scene.image.ImageView;
import org.maks.musicplayer.controller.Widget;
import org.maks.musicplayer.enumeration.Icon;
import org.maks.musicplayer.utils.IconUtils;

public class RepeatSongToggle extends ImageView {

    private boolean onRepeat = false;

    public void toggleOnRepeat() {
        if (onRepeat) {
            onRepeat = false;
            setImage(IconUtils.image(Icon.REPEAT));
        } else {
            onRepeat = true;
            setImage(IconUtils.image(Icon.REPEAT_SINGLE));
        }
    }

    public void nextSong(Widget widgetController) {
        if (onRepeat) {
            widgetController.play();
        } else {
            widgetController.next();
        }
    }


}
