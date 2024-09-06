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

public data class RenamePlaylistDialogArgs(
  public val playlistUid: Music.UID,
  public val template: String?,
  public val applySongUids: Array<Music.UID>,
  public val reason: PlaylistDecision.Rename.Reason
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
    result.putString("template", this.template)
    result.putParcelableArray("applySongUids", this.applySongUids)
    if (Parcelable::class.java.isAssignableFrom(PlaylistDecision.Rename.Reason::class.java)) {
      result.putParcelable("reason", this.reason as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(PlaylistDecision.Rename.Reason::class.java)) {
      result.putSerializable("reason", this.reason as Serializable)
    } else {
      throw UnsupportedOperationException(PlaylistDecision.Rename.Reason::class.java.name +
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
    result.set("template", this.template)
    result.set("applySongUids", this.applySongUids)
    if (Parcelable::class.java.isAssignableFrom(PlaylistDecision.Rename.Reason::class.java)) {
      result.set("reason", this.reason as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(PlaylistDecision.Rename.Reason::class.java)) {
      result.set("reason", this.reason as Serializable)
    } else {
      throw UnsupportedOperationException(PlaylistDecision.Rename.Reason::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST","DEPRECATION")
    public fun fromBundle(bundle: Bundle): RenamePlaylistDialogArgs {
      bundle.setClassLoader(RenamePlaylistDialogArgs::class.java.classLoader)
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
      val __template : String?
      if (bundle.containsKey("template")) {
        __template = bundle.getString("template")
      } else {
        throw IllegalArgumentException("Required argument \"template\" is missing and does not have an android:defaultValue")
      }
      val __applySongUids : Array<Music.UID>?
      if (bundle.containsKey("applySongUids")) {
        __applySongUids = bundle.getParcelableArray("applySongUids")?.map { it as Music.UID
            }?.toTypedArray()
        if (__applySongUids == null) {
          throw IllegalArgumentException("Argument \"applySongUids\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"applySongUids\" is missing and does not have an android:defaultValue")
      }
      val __reason : PlaylistDecision.Rename.Reason?
      if (bundle.containsKey("reason")) {
        if (Parcelable::class.java.isAssignableFrom(PlaylistDecision.Rename.Reason::class.java) ||
            Serializable::class.java.isAssignableFrom(PlaylistDecision.Rename.Reason::class.java)) {
          __reason = bundle.get("reason") as PlaylistDecision.Rename.Reason?
        } else {
          throw UnsupportedOperationException(PlaylistDecision.Rename.Reason::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__reason == null) {
          throw IllegalArgumentException("Argument \"reason\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"reason\" is missing and does not have an android:defaultValue")
      }
      return RenamePlaylistDialogArgs(__playlistUid, __template, __applySongUids, __reason)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): RenamePlaylistDialogArgs {
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
      val __template : String?
      if (savedStateHandle.contains("template")) {
        __template = savedStateHandle["template"]
      } else {
        throw IllegalArgumentException("Required argument \"template\" is missing and does not have an android:defaultValue")
      }
      val __applySongUids : Array<Music.UID>?
      if (savedStateHandle.contains("applySongUids")) {
        __applySongUids = savedStateHandle.get<Array<Parcelable>>("applySongUids")?.map { it as
            Music.UID }?.toTypedArray()
        if (__applySongUids == null) {
          throw IllegalArgumentException("Argument \"applySongUids\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"applySongUids\" is missing and does not have an android:defaultValue")
      }
      val __reason : PlaylistDecision.Rename.Reason?
      if (savedStateHandle.contains("reason")) {
        if (Parcelable::class.java.isAssignableFrom(PlaylistDecision.Rename.Reason::class.java) ||
            Serializable::class.java.isAssignableFrom(PlaylistDecision.Rename.Reason::class.java)) {
          __reason = savedStateHandle.get<PlaylistDecision.Rename.Reason?>("reason")
        } else {
          throw UnsupportedOperationException(PlaylistDecision.Rename.Reason::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__reason == null) {
          throw IllegalArgumentException("Argument \"reason\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"reason\" is missing and does not have an android:defaultValue")
      }
      return RenamePlaylistDialogArgs(__playlistUid, __template, __applySongUids, __reason)
    }
  }
}
