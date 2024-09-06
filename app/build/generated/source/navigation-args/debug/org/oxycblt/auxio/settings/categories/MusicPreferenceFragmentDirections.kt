package org.oxycblt.auxio.settings.categories

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.oxycblt.auxio.R

public class MusicPreferenceFragmentDirections private constructor() {
  public companion object {
    public fun separatorsSettings(): NavDirections =
        ActionOnlyNavDirections(R.id.separators_settings)
  }
}
