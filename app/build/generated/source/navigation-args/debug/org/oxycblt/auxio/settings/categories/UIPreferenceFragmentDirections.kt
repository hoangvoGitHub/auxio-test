package org.oxycblt.auxio.settings.categories

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.oxycblt.auxio.R

public class UIPreferenceFragmentDirections private constructor() {
  public companion object {
    public fun accentSettings(): NavDirections = ActionOnlyNavDirections(R.id.accent_settings)
  }
}
