package org.oxycblt.auxio.music.decision

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import org.oxycblt.auxio.R
import org.oxycblt.auxio.music.Music
import org.oxycblt.auxio.music.PlaylistDecision

public class AddToPlaylistDialogDirections private constructor() {
  private data class NewPlaylist(
    public val songUids: Array<Music.UID>,
    public val template: String?,
    public val reason: PlaylistDecision.New.Reason
  ) : NavDirections {
    public override val actionId: Int = R.id.new_playlist

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        result.putParcelableArray("songUids", this.songUids)
        result.putString("template", this.template)
        if (Parcelable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java)) {
          result.putParcelable("reason", this.reason as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(PlaylistDecision.New.Reason::class.java)) {
          result.putSerializable("reason", this.reason as Serializable)
        } else {
          throw UnsupportedOperationException(PlaylistDecision.New.Reason::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun newPlaylist(
      songUids: Array<Music.UID>,
      template: String?,
      reason: PlaylistDecision.New.Reason
    ): NavDirections = NewPlaylist(songUids, template, reason)
  }
}
