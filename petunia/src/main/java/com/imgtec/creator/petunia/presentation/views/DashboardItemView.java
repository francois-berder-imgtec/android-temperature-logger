/*
 * <b>Copyright 2015 by Imagination Technologies Limited
 * and/or its affiliated group companies.</b>
 *
 * All rights reserved.  No part of this software, either
 * material or conceptual may be copied or distributed,
 * transmitted, transcribed, stored in a retrieval system
 * or translated into any human or computer language in any
 * form by any means, electronic, mechanical, manual or
 * other-wise, or disclosed to the third parties without the
 * express written permission of Imagination Technologies
 * Limited, Home Park Estate, Kings Langley, Hertfordshire,
 * WD4 8LZ, U.K.
 */

package com.imgtec.creator.petunia.presentation.views;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

public class DashboardItemView extends CardView {

  public DashboardItemView(Context context) {
    super(context);
  }

  public DashboardItemView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public DashboardItemView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    //for square grid items call: super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    super.onMeasure(widthMeasureSpec, widthMeasureSpec);
  }
}
