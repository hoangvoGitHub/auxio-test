package org.oxycblt.auxio.settings.categories

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.oxycblt.auxio.R

public class PersonalizePreferenceFragmentDirections private constructor() {
  public companion object {
    public fun tabSettings(): NavDirections = ActionOnlyNavDirections(R.id.tab_settings)
  }
}
