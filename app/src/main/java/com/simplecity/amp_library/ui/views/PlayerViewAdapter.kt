package com.simplecity.amp_library.ui.views

import com.simplecity.amp_library.model.Playlist
import com.simplecity.amp_library.model.Song
import com.simplecity.amp_library.ui.screens.nowplaying.PlayerView

abstract class PlayerViewAdapter : PlayerView {

    override fun setSeekProgress(progress: Int) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun currentTimeVisibilityChanged(visible: Boolean) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun currentTimeChanged(seconds: Long) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun totalTimeChanged(seconds: Long) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun queueChanged(queuePosition: Int, queueLength: Int) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun playbackChanged(isPlaying: Boolean) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun shuffleChanged(shuffleMode: Int) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun repeatChanged(repeatMode: Int) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun favoriteChanged(isFavorite: Boolean) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun trackInfoChanged(song: Song?) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun showLyricsDialog() {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun showUpgradeDialog() {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun presentCreatePlaylistDialog(songs: List<Song>) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun presentSongInfoDialog(song: Song) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun onSongsAddedToPlaylist(playlist: Playlist, numSongs: Int) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun onSongsAddedToQueue(numSongs: Int) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun presentTagEditorDialog(song: Song) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun presentDeleteDialog(songs: List<Song>) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun shareSong(song: Song) {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun presentRingtonePermissionDialog() {
        // Cette méthode est volontairement vide car le drag-and-drop
    }

    override fun showRingtoneSetMessage() {
        // Cette méthode est volontairement vide car le drag-and-drop
    }
}