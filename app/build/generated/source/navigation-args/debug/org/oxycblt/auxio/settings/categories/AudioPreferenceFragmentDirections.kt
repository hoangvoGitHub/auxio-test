package org.oxycblt.auxio.settings.categories

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.oxycblt.auxio.R

public class AudioPreferenceFragmentDirections private constructor() {
  public companion object {
    public fun preAmpSettings(): NavDirections = ActionOnlyNavDirections(R.id.pre_amp_settings)
  }
}
