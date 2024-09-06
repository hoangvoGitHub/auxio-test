package org.oxycblt.auxio.detail.decision

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

public data class ShowArtistDialogArgs(
  public val itemUid: Music.UID
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.putParcelable("itemUid", this.itemUid as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.putSerializable("itemUid", this.itemUid as Serializable)
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
      result.set("itemUid", this.itemUid as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.set("itemUid", this.itemUid as Serializable)
    } else {
      throw UnsupportedOperationException(Music.UID::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): ShowArtistDialogArgs {
      bundle.setClassLoader(ShowArtistDialogArgs::class.java.classLoader)
      val __itemUid : Music.UID?
      if (bundle.containsKey("itemUid")) {
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java) ||
            Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          __itemUid = bundle.get("itemUid") as Music.UID?
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__itemUid == null) {
          throw IllegalArgumentException("Argument \"itemUid\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"itemUid\" is missing and does not have an android:defaultValue")
      }
      return ShowArtistDialogArgs(__itemUid)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ShowArtistDialogArgs {
      val __itemUid : Music.UID?
      if (savedStateHandle.contains("itemUid")) {
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java) ||
            Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          __itemUid = savedStateHandle.get<Music.UID?>("itemUid")
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__itemUid == null) {
          throw IllegalArgumentException("Argument \"itemUid\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"itemUid\" is missing and does not have an android:defaultValue")
      }
      return ShowArtistDialogArgs(__itemUid)
    }
  }
}
