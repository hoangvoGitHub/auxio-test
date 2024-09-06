package org.oxycblt.auxio.music.decision

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.oxycblt.auxio.music.Music

public data class ExportPlaylistDialogArgs(
  public val playlistUid: Music.UID
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.putParcelable("playlistUid", this.playlistUid as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.putSerializable("playlistUid", this.playlistUid as Serializable)
    } else {
      throw UnsupportedOperationException(Music.UID::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.set("playlistUid", this.playlistUid as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.set("playlistUid", this.playlistUid as Serializable)
    } else {
      throw UnsupportedOperationException(Music.UID::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): ExportPlaylistDialogArgs {
      bundle.setClassLoader(ExportPlaylistDialogArgs::class.java.classLoader)
      val __playlistUid : Music.UID?
      if (bundle.containsKey("playlistUid")) {
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java) ||
            Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          __playlistUid = bundle.get("playlistUid") as Music.UID?
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__playlistUid == null) {
          throw IllegalArgumentException("Argument \"playlistUid\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"playlistUid\" is missing and does not have an android:defaultValue")
      }
      return ExportPlaylistDialogArgs(__playlistUid)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ExportPlaylistDialogArgs {
      val __playlistUid : Music.UID?
      if (savedStateHandle.contains("playlistUid")) {
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java) ||
            Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          __playlistUid = savedStateHandle.get<Music.UID?>("playlistUid")
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__playlistUid == null) {
          throw IllegalArgumentException("Argument \"playlistUid\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"playlistUid\" is missing and does not have an android:defaultValue")
      }
      return ExportPlaylistDialogArgs(__playlistUid)
    }
  }
}
