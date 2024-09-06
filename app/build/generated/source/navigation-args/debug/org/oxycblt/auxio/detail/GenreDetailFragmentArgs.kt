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

public data class GenreDetailFragmentArgs(
  public val genreUid: Music.UID
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.putParcelable("genreUid", this.genreUid as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.putSerializable("genreUid", this.genreUid as Serializable)
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
      result.set("genreUid", this.genreUid as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
      result.set("genreUid", this.genreUid as Serializable)
    } else {
      throw UnsupportedOperationException(Music.UID::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): GenreDetailFragmentArgs {
      bundle.setClassLoader(GenreDetailFragmentArgs::class.java.classLoader)
      val __genreUid : Music.UID?
      if (bundle.containsKey("genreUid")) {
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java) ||
            Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          __genreUid = bundle.get("genreUid") as Music.UID?
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__genreUid == null) {
          throw IllegalArgumentException("Argument \"genreUid\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"genreUid\" is missing and does not have an android:defaultValue")
      }
      return GenreDetailFragmentArgs(__genreUid)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): GenreDetailFragmentArgs {
      val __genreUid : Music.UID?
      if (savedStateHandle.contains("genreUid")) {
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java) ||
            Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          __genreUid = savedStateHandle.get<Music.UID?>("genreUid")
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__genreUid == null) {
          throw IllegalArgumentException("Argument \"genreUid\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"genreUid\" is missing and does not have an android:defaultValue")
      }
      return GenreDetailFragmentArgs(__genreUid)
    }
  }
}
