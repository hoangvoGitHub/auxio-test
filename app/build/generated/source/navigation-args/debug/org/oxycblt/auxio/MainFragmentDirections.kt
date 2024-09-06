package org.oxycblt.auxio

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class MainFragmentDirections private constructor() {
  public companion object {
    public fun preferences(): NavDirections = ActionOnlyNavDirections(R.id.preferences)

    public fun about(): NavDirections = ActionOnlyNavDirections(R.id.about)
  }
}
