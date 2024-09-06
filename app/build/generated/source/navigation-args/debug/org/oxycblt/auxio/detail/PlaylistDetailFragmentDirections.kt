package org.oxycblt.auxio.detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import org.oxycblt.auxio.R
import org.oxycblt.auxio.list.menu.Menu
import org.oxycblt.auxio.music.Music
import org.oxycblt.auxio.music.PlaylistDecision

public class PlaylistDetailFragmentDirections private constructor() {
  private data class ShowSong(
    public val songUid: Music.UID
  ) : NavDirections {
    public override val actionId: Int = R.id.show_song

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java)) {
          result.putParcelable("songUid", this.songUid as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          result.putSerializable("songUid", this.songUid as Serializable)
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ShowAlbum(
    public val albumUid: Music.UID
  ) : NavDirections {
    public override val actionId: Int = R.id.show_album

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java)) {
          result.putParcelable("albumUid", this.albumUid as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          result.putSerializable("albumUid", this.albumUid as Serializable)
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class ShowArtist(
    public val artistUid: Music.UID
  ) : NavDirections {
    public override val actionId: Int = R.id.show_artist

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class ShowArtistChoices(
    public val itemUid: Music.UID
  ) : NavDirections {
    public override val actionId: Int = R.id.show_artist_choices

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class OpenSongMenu(
    public val parcel: Menu.ForSong.Parcel
  ) : NavDirections {
    public override val actionId: Int = R.id.open_song_menu

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Menu.ForSong.Parcel::class.java)) {
          result.putParcelable("parcel", this.parcel as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Menu.ForSong.Parcel::class.java)) {
          result.putSerializable("parcel", this.parcel as Serializable)
        } else {
          throw UnsupportedOperationException(Menu.ForSong.Parcel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class OpenPlaylistMenu(
    public val parcel: Menu.ForPlaylist.Parcel
  ) : NavDirections {
    public override val actionId: Int = R.id.open_playlist_menu

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Menu.ForPlaylist.Parcel::class.java)) {
          result.putParcelable("parcel", this.parcel as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Menu.ForPlaylist.Parcel::class.java)) {
          result.putSerializable("parcel", this.parcel as Serializable)
        } else {
          throw UnsupportedOperationException(Menu.ForPlaylist.Parcel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class OpenSelectionMenu(
    public val parcel: Menu.ForSelection.Parcel
  ) : NavDirections {
    public override val actionId: Int = R.id.open_selection_menu

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Menu.ForSelection.Parcel::class.java)) {
          result.putParcelable("parcel", this.parcel as Parcelable)
        } else if
            (Serializable::class.java.isAssignableFrom(Menu.ForSelection.Parcel::class.java)) {
          result.putSerializable("parcel", this.parcel as Serializable)
        } else {
          throw UnsupportedOperationException(Menu.ForSelection.Parcel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class RenamePlaylist(
    public val playlistUid: Music.UID,
    public val template: String?,
    public val applySongUids: Array<Music.UID>,
    public val reason: PlaylistDecision.Rename.Reason
  ) : NavDirections {
    public override val actionId: Int = R.id.rename_playlist

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class ExportPlaylist(
    public val playlistUid: Music.UID
  ) : NavDirections {
    public override val actionId: Int = R.id.export_playlist

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class DeletePlaylist(
    public val playlistUid: Music.UID
  ) : NavDirections {
    public override val actionId: Int = R.id.delete_playlist

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class AddToPlaylist(
    public val songUids: Array<Music.UID>
  ) : NavDirections {
    public override val actionId: Int = R.id.add_to_playlist

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putParcelableArray("songUids", this.songUids)
        return result
      }
  }

  private data class PlayFromArtist(
    public val songUid: Music.UID
  ) : NavDirections {
    public override val actionId: Int = R.id.play_from_artist

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java)) {
          result.putParcelable("songUid", this.songUid as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          result.putSerializable("songUid", this.songUid as Serializable)
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class PlayFromGenre(
    public val songUid: Music.UID
  ) : NavDirections {
    public override val actionId: Int = R.id.play_from_genre

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Music.UID::class.java)) {
          result.putParcelable("songUid", this.songUid as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Music.UID::class.java)) {
          result.putSerializable("songUid", this.songUid as Serializable)
        } else {
          throw UnsupportedOperationException(Music.UID::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun sort(): NavDirections = ActionOnlyNavDirections(R.id.sort)

    public fun showSong(songUid: Music.UID): NavDirections = ShowSong(songUid)

    public fun showAlbum(albumUid: Music.UID): NavDirections = ShowAlbum(albumUid)

    public fun showArtist(artistUid: Music.UID): NavDirections = ShowArtist(artistUid)

    public fun showArtistChoices(itemUid: Music.UID): NavDirections = ShowArtistChoices(itemUid)

    public fun openSongMenu(parcel: Menu.ForSong.Parcel): NavDirections = OpenSongMenu(parcel)

    public fun openPlaylistMenu(parcel: Menu.ForPlaylist.Parcel): NavDirections =
        OpenPlaylistMenu(parcel)

    public fun openSelectionMenu(parcel: Menu.ForSelection.Parcel): NavDirections =
        OpenSelectionMenu(parcel)

    public fun renamePlaylist(
      playlistUid: Music.UID,
      template: String?,
      applySongUids: Array<Music.UID>,
      reason: PlaylistDecision.Rename.Reason
    ): NavDirections = RenamePlaylist(playlistUid, template, applySongUids, reason)

    public fun exportPlaylist(playlistUid: Music.UID): NavDirections = ExportPlaylist(playlistUid)

    public fun deletePlaylist(playlistUid: Music.UID): NavDirections = DeletePlaylist(playlistUid)

    public fun addToPlaylist(songUids: Array<Music.UID>): NavDirections = AddToPlaylist(songUids)

    public fun playFromArtist(songUid: Music.UID): NavDirections = PlayFromArtist(songUid)

    public fun playFromGenre(songUid: Music.UID): NavDirections = PlayFromGenre(songUid)
  }
}
