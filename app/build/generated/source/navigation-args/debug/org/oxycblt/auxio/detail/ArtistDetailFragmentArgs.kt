package org.oxycblt.auxio.detail

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

public data class ArtistDetailFragmentArgs(
  public val artistUid: Music.UID
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.putParcelable("artistUid", this.artistUid as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.putSerializable("artistUid", this.artistUid as Serializable)
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
      result.set("artistUid", this.artistUid as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.set("artistUid", this.artistUid as Serializable)
    } else {
      throw UnsupportedOperationException(Music.UID::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): ArtistDetailFragmentArgs {
      bundle.setClassLoader(ArtistDetailFragmentArgs::class.java.classLoader)
      val __artistUid : Music.UID?
      if (bundle.containsKey("artistUid")) {
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java) ||
            Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          __artistUid = bundle.get("artistUid") as Music.UID?
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__artistUid == null) {
          throw IllegalArgumentException("Argument \"artistUid\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"artistUid\" is missing and does not have an android:defaultValue")
      }
      return ArtistDetailFragmentArgs(__artistUid)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ArtistDetailFragmentArgs {
      val __artistUid : Music.UID?
      if (savedStateHandle.contains("artistUid")) {
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java) ||
            Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          __artistUid = savedStateHandle.get<Music.UID?>("artistUid")
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__artistUid == null) {
          throw IllegalArgumentException("Argument \"artistUid\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"artistUid\" is missing and does not have an android:defaultValue")
      }
      return ArtistDetailFragmentArgs(__artistUid)
    }
  }
}
