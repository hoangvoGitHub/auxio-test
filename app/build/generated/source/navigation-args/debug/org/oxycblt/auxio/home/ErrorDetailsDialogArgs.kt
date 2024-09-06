package org.oxycblt.auxio.home

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ErrorDetailsDialogArgs(
  public val error: Exception
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Exception::class.java)) {
      result.putParcelable("error", this.error as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Exception::class.java)) {
      result.putSerializable("error", this.error as Serializable)
    } else {
      throw UnsupportedOperationException(Exception::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Exception::class.java)) {
      result.set("error", this.error as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Exception::class.java)) {
      result.set("error", this.error as Serializable)
    } else {
      throw UnsupportedOperationException(Exception::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): ErrorDetailsDialogArgs {
      bundle.setClassLoader(ErrorDetailsDialogArgs::class.java.classLoader)
      val __error : Exception?
      if (bundle.containsKey("error")) {
        if (Parcelable::class.java.isAssignableFrom(Exception::class.java) ||
            Serializable::class.java.isAssignableFrom(Exception::class.java)) {
          __error = bundle.get("error") as Exception?
        } else {
          throw UnsupportedOperationException(Exception::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__error == null) {
          throw IllegalArgumentException("Argument \"error\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"error\" is missing and does not have an android:defaultValue")
      }
      return ErrorDetailsDialogArgs(__error)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ErrorDetailsDialogArgs {
      val __error : Exception?
      if (savedStateHandle.contains("error")) {
        if (Parcelable::class.java.isAssignableFrom(Exception::class.java) ||
            Serializable::class.java.isAssignableFrom(Exception::class.java)) {
          __error = savedStateHandle.get<Exception?>("error")
        } else {
          throw UnsupportedOperationException(Exception::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__error == null) {
          throw IllegalArgumentException("Argument \"error\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"error\" is missing and does not have an android:defaultValue")
      }
      return ErrorDetailsDialogArgs(__error)
    }
  }
}
