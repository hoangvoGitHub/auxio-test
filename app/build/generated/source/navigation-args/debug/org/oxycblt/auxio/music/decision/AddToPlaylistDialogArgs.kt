package org.oxycblt.auxio.music.decision

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.oxycblt.auxio.music.Music

public data class AddToPlaylistDialogArgs(
  public val songUids: Array<Music.UID>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putParcelableArray("songUids", this.songUids)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("songUids", this.songUids)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST","DEPRECATION")
    public fun fromBundle(bundle: Bundle): AddToPlaylistDialogArgs {
      bundle.setClassLoader(AddToPlaylistDialogArgs::class.java.classLoader)
      val __songUids : Array<Music.UID>?
      if (bundle.containsKey("songUids")) {
        __songUids = bundle.getParcelableArray("songUids")?.map { it as Music.UID }?.toTypedArray()
        if (__songUids == null) {
          throw IllegalArgumentException("Argument \"songUids\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"songUids\" is missing and does not have an android:defaultValue")
      }
      return AddToPlaylistDialogArgs(__songUids)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddToPlaylistDialogArgs {
      val __songUids : Array<Music.UID>?
      if (savedStateHandle.contains("songUids")) {
        __songUids = savedStateHandle.get<Array<Parcelable>>("songUids")?.map { it as Music.UID
            }?.toTypedArray()
        if (__songUids == null) {
          throw IllegalArgumentException("Argument \"songUids\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"songUids\" is missing and does not have an android:defaultValue")
      }
      return AddToPlaylistDialogArgs(__songUids)
    }
  }
}
