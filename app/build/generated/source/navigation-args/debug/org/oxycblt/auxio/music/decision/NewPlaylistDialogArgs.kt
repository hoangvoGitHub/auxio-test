package org.oxycblt.auxio.music.decision

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.oxycblt.auxio.music.Music
import org.oxycblt.auxio.music.PlaylistDecision

public data class NewPlaylistDialogArgs(
  public val songUids: Array<Music.UID>,
  public val template: String?,
  public val reason: PlaylistDecision.New.Reason
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putParcelableArray("songUids", this.songUids)
    result.putString("template", this.template)
    if (Parcelable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java)) {
      result.putParcelable("reason", this.reason as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java)) {
      result.putSerializable("reason", this.reason as Serializable)
    } else {
      throw UnsupportedOperationException(PlaylistDecision.New.Reason::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("songUids", this.songUids)
    result.set("template", this.template)
    if (Parcelable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java)) {
      result.set("reason", this.reason as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java)) {
      result.set("reason", this.reason as Serializable)
    } else {
      throw UnsupportedOperationException(PlaylistDecision.New.Reason::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST","DEPRECATION")
    public fun fromBundle(bundle: Bundle): NewPlaylistDialogArgs {
      bundle.setClassLoader(NewPlaylistDialogArgs::class.java.classLoader)
      val __songUids : Array<Music.UID>?
      if (bundle.containsKey("songUids")) {
        __songUids = bundle.getParcelableArray("songUids")?.map { it as Music.UID }?.toTypedArray()
        if (__songUids == null) {
          throw IllegalArgumentException("Argument \"songUids\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"songUids\" is missing and does not have an android:defaultValue")
      }
      val __template : String?
      if (bundle.containsKey("template")) {
        __template = bundle.getString("template")
      } else {
        throw IllegalArgumentException("Required argument \"template\" is missing and does not have an android:defaultValue")
      }
      val __reason : PlaylistDecision.New.Reason?
      if (bundle.containsKey("reason")) {
        if (Parcelable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java) ||
            Serializable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java)) {
          __reason = bundle.get("reason") as PlaylistDecision.New.Reason?
        } else {
          throw UnsupportedOperationException(PlaylistDecision.New.Reason::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__reason == null) {
          throw IllegalArgumentException("Argument \"reason\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"reason\" is missing and does not have an android:defaultValue")
      }
      return NewPlaylistDialogArgs(__songUids, __template, __reason)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): NewPlaylistDialogArgs {
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
      val __template : String?
      if (savedStateHandle.contains("template")) {
        __template = savedStateHandle["template"]
      } else {
        throw IllegalArgumentException("Required argument \"template\" is missing and does not have an android:defaultValue")
      }
      val __reason : PlaylistDecision.New.Reason?
      if (savedStateHandle.contains("reason")) {
        if (Parcelable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java) ||
            Serializable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java)) {
          __reason = savedStateHandle.get<PlaylistDecision.New.Reason?>("reason")
        } else {
          throw UnsupportedOperationException(PlaylistDecision.New.Reason::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__reason == null) {
          throw IllegalArgumentException("Argument \"reason\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"reason\" is missing and does not have an android:defaultValue")
      }
      return NewPlaylistDialogArgs(__songUids, __template, __reason)
    }
  }
}
