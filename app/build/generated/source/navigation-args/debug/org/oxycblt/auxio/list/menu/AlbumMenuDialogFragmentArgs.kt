package org.oxycblt.auxio.list.menu

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class AlbumMenuDialogFragmentArgs(
  public val parcel: Menu.ForAlbum.Parcel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Menu.ForAlbum.Parcel::class.java)) {
      result.putParcelable("parcel", this.parcel as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Menu.ForAlbum.Parcel::class.java)) {
      result.putSerializable("parcel", this.parcel as Serializable)
    } else {
      throw UnsupportedOperationException(Menu.ForAlbum.Parcel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Menu.ForAlbum.Parcel::class.java)) {
      result.set("parcel", this.parcel as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Menu.ForAlbum.Parcel::class.java)) {
      result.set("parcel", this.parcel as Serializable)
    } else {
      throw UnsupportedOperationException(Menu.ForAlbum.Parcel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): AlbumMenuDialogFragmentArgs {
      bundle.setClassLoader(AlbumMenuDialogFragmentArgs::class.java.classLoader)
      val __parcel : Menu.ForAlbum.Parcel?
      if (bundle.containsKey("parcel")) {
        if (Parcelable::class.java.isAssignableFrom(Menu.ForAlbum.Parcel::class.java) ||
            Serializable::class.java.isAssignableFrom(Menu.ForAlbum.Parcel::class.java)) {
          __parcel = bundle.get("parcel") as Menu.ForAlbum.Parcel?
        } else {
          throw UnsupportedOperationException(Menu.ForAlbum.Parcel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__parcel == null) {
          throw IllegalArgumentException("Argument \"parcel\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"parcel\" is missing and does not have an android:defaultValue")
      }
      return AlbumMenuDialogFragmentArgs(__parcel)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        AlbumMenuDialogFragmentArgs {
      val __parcel : Menu.ForAlbum.Parcel?
      if (savedStateHandle.contains("parcel")) {
        if (Parcelable::class.java.isAssignableFrom(Menu.ForAlbum.Parcel::class.java) ||
            Serializable::class.java.isAssignableFrom(Menu.ForAlbum.Parcel::class.java)) {
          __parcel = savedStateHandle.get<Menu.ForAlbum.Parcel?>("parcel")
        } else {
          throw UnsupportedOperationException(Menu.ForAlbum.Parcel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__parcel == null) {
          throw IllegalArgumentException("Argument \"parcel\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"parcel\" is missing and does not have an android:defaultValue")
      }
      return AlbumMenuDialogFragmentArgs(__parcel)
    }
  }
}
