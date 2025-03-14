/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 04 01:50:41 GMT 2025
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.time.chrono.ChronoLocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.api.SortOrder;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.legend.LegendTitle;
import org.jfree.chart.plot.CenterTextMode;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.pie.PiePlot;
import org.jfree.chart.plot.pie.PiePlotState;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RingPlot_ESTest extends RingPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      Font font0 = LegendTitle.DEFAULT_ITEM_FONT;
      ringPlot0.setCenterTextFont(font0);
      RingPlot ringPlot1 = new RingPlot();
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertEquals(0.2, ringPlot1.getSectionDepth(), 0.01);
      assertTrue(ringPlot1.getSeparatorsVisible());
      assertFalse(boolean0);
      assertEquals(0.2, ringPlot1.getOuterSeparatorExtension(), 0.01);
      assertFalse(ringPlot1.equals((Object)ringPlot0));
      assertEquals(0.2, ringPlot1.getInnerSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      BufferedImage bufferedImage0 = new BufferedImage(10, 10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      PiePlotState piePlotState0 = ringPlot0.initialise(graphics2D0, rectangle2D_Float0, ringPlot0, (Integer) 10, plotRenderingInfo0);
      // Undeclared exception!
      try { 
        ringPlot0.drawItem(graphics2D0, 1489, rectangle2D_Float0, piePlotState0, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.RingPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(2772.406);
      Paint paint0 = candlestickRenderer0.getUpPaint();
      ringPlot0.setSeparatorPaint(paint0);
      Color color0 = (Color)ringPlot0.getSeparatorPaint();
      assertEquals((-16711936), color0.getRGB());
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      BasicStroke basicStroke0 = (BasicStroke)PeriodAxisLabelInfo.DEFAULT_DIVIDER_STROKE;
      ringPlot0.setSeparatorStroke(basicStroke0);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      Font font0 = LegendTitle.DEFAULT_ITEM_FONT;
      ringPlot0.setCenterTextFont(font0);
      Font font1 = ringPlot0.getCenterTextFont();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(12.0F, font1.getSize2D(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.setStartAngle((-137.80962679004));
      JFreeChart jFreeChart0 = new JFreeChart("E($/BSK7K", ringPlot0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(2, 505, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      PiePlotState piePlotState0 = ringPlot0.initialise(graphics2D0, (Rectangle2D) null, ringPlot0, (Integer) ringPlot0.MINIMUM_HEIGHT_TO_DRAW, plotRenderingInfo0);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(3, piePlotState0.getPassesRequired());
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      
      ringPlot0.setSectionDepth((-1.0));
      double double0 = ringPlot0.getSectionDepth();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.setOuterSeparatorExtension((-406.554));
      double double0 = ringPlot0.getOuterSeparatorExtension();
      assertEquals((-406.554), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      
      ringPlot0.setSectionDepth((-1.0));
      double double0 = ringPlot0.getLabelLinkDepth();
      assertEquals((-0.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      
      ringPlot0.setInnerSeparatorExtension(0);
      double double0 = ringPlot0.getInnerSeparatorExtension();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      Color color0 = new Color(0, 1, 0, 10);
      ringPlot0.setCenterTextColor(color0);
      ringPlot0.getCenterTextColor();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      Color color0 = Color.pink;
      ringPlot0.setCenterTextColor(color0);
      ringPlot0.getCenterTextColor();
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.setCenterText("SansSerif.italic");
      ringPlot0.getCenterText();
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.setCenterText("");
      ringPlot0.getCenterText();
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      // Undeclared exception!
      try { 
        ringPlot0.setSeparatorStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      // Undeclared exception!
      try { 
        ringPlot0.setSeparatorPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      // Undeclared exception!
      try { 
        ringPlot0.setCenterTextFormatter((Format) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'formatter' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      // Undeclared exception!
      try { 
        ringPlot0.setCenterTextFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      // Undeclared exception!
      try { 
        ringPlot0.initialise((Graphics2D) null, (Rectangle2D) null, (PiePlot) null, (Integer) ringPlot0.MINIMUM_WIDTH_TO_DRAW, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.pie.PiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      DefaultKeyedValuesDataset<ChronoLocalDate> defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset<ChronoLocalDate>();
      RingPlot ringPlot1 = new RingPlot(defaultKeyedValuesDataset0);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        ringPlot1.initialise((Graphics2D) null, (Rectangle2D) null, ringPlot0, (Integer) null, plotRenderingInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'dataset' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      Object object0 = ringPlot0.clone();
      ringPlot0.setDrawingSupplier((DrawingSupplier) null);
      // Undeclared exception!
      try { 
        ringPlot0.equals(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      DefaultPieDataset<ChronoLocalDate> defaultPieDataset0 = new DefaultPieDataset<ChronoLocalDate>();
      ringPlot0.setDataset(defaultPieDataset0);
      // Undeclared exception!
      try { 
        ringPlot0.drawItem((Graphics2D) null, 10, (Rectangle2D) null, (PiePlotState) null, 10);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      double double0 = ringPlot0.getSectionDepth();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = (RingPlot)ringPlot0.clone();
      assertEquals(0.2, ringPlot1.getOuterSeparatorExtension(), 0.01);
      
      ringPlot1.setOuterSeparatorExtension(1.0F);
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = new RingPlot();
      ringPlot1.setInnerSeparatorExtension(10);
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertEquals(10.0, ringPlot1.getInnerSeparatorExtension(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = new RingPlot();
      assertTrue(ringPlot1.equals((Object)ringPlot0));
      
      ringPlot1.setSeparatorPaint(ringPlot0.DEFAULT_BACKGROUND_PAINT);
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertFalse(ringPlot1.equals((Object)ringPlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = new RingPlot();
      assertTrue(ringPlot1.equals((Object)ringPlot0));
      
      ringPlot1.setSeparatorStroke(ringPlot0.DEFAULT_OUTLINE_STROKE);
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertFalse(ringPlot1.equals((Object)ringPlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = new RingPlot();
      ringPlot1.setSeparatorsVisible(false);
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertFalse(ringPlot1.getSeparatorsVisible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = new RingPlot();
      assertTrue(ringPlot1.equals((Object)ringPlot0));
      
      SystemColor systemColor0 = SystemColor.textInactiveText;
      ringPlot1.setCenterTextColor(systemColor0);
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = new RingPlot();
      assertTrue(ringPlot1.equals((Object)ringPlot0));
      
      ringPlot1.setCenterText("59%OumogY1Lv{");
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertFalse(ringPlot1.equals((Object)ringPlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = new RingPlot();
      CenterTextMode centerTextMode0 = CenterTextMode.FIXED;
      ringPlot1.setCenterTextMode(centerTextMode0);
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertFalse(ringPlot1.equals((Object)ringPlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultPieDataset<SortOrder> defaultPieDataset0 = new DefaultPieDataset<SortOrder>();
      RingPlot ringPlot0 = new RingPlot(defaultPieDataset0);
      boolean boolean0 = defaultPieDataset0.hasListener(ringPlot0);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(boolean0);
      assertTrue(ringPlot0.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      RingPlot ringPlot1 = (RingPlot)ringPlot0.clone();
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertEquals(0.2, ringPlot1.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot1.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot1.getOuterSeparatorExtension(), 0.01);
      assertTrue(ringPlot1.getSeparatorsVisible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      ringPlot0.setCenterTextFormatter(numberFormat0);
      RingPlot ringPlot1 = new RingPlot();
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertEquals(0.2, ringPlot1.getOuterSeparatorExtension(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.2, ringPlot1.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot1.getSectionDepth(), 0.01);
      assertTrue(ringPlot1.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      assertTrue(ringPlot0.getSeparatorsVisible());
      
      ringPlot0.setSeparatorsVisible(false);
      boolean boolean0 = ringPlot0.getSeparatorsVisible();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      boolean boolean0 = ringPlot0.getSeparatorsVisible();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.getCenterTextMode();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      double double0 = ringPlot0.getLabelLinkDepth();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.1, double0, 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      DecimalFormat decimalFormat0 = (DecimalFormat)ringPlot0.getCenterTextFormatter();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0, decimalFormat0.getGroupingSize());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.setSectionDepth(0.4);
      RingPlot ringPlot1 = new RingPlot();
      boolean boolean0 = ringPlot1.equals(ringPlot0);
      assertEquals(0.4, ringPlot0.getSectionDepth(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      double double0 = ringPlot0.getInnerSeparatorExtension();
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      BasicStroke basicStroke0 = (BasicStroke)ringPlot0.getSeparatorStroke();
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0, basicStroke0.getLineJoin());
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.getCenterTextColor();
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      // Undeclared exception!
      try { 
        ringPlot0.setCenterTextColor((Color) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'color' argument.
         //
         verifyException("org.jfree.chart.internal.Args", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      double double0 = ringPlot0.getOuterSeparatorExtension();
      assertEquals(0.2, double0, 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      SystemColor systemColor0 = SystemColor.scrollbar;
      ringPlot0.setSeparatorPaint(systemColor0);
      RingPlot ringPlot1 = (RingPlot)ringPlot0.clone();
      boolean boolean0 = ringPlot0.equals(ringPlot1);
      assertEquals(0.2, ringPlot1.getOuterSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot1.getSectionDepth(), 0.01);
      assertTrue(ringPlot1.getSeparatorsVisible());
      assertEquals(0.2, ringPlot1.getInnerSeparatorExtension(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      ringPlot0.getCenterText();
      assertEquals(0.2, ringPlot0.getSectionDepth(), 0.01);
      assertEquals(0.2, ringPlot0.getInnerSeparatorExtension(), 0.01);
      assertEquals(0.2, ringPlot0.getOuterSeparatorExtension(), 0.01);
      assertTrue(ringPlot0.getSeparatorsVisible());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(596.42676824864);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      ringPlot0.setCenterTextFont(meterPlot0.DEFAULT_LABEL_FONT);
      RingPlot ringPlot1 = new RingPlot();
      boolean boolean0 = ringPlot1.equals(ringPlot0);
      assertEquals(0.2, ringPlot1.getOuterSeparatorExtension(), 0.01);
      assertFalse(ringPlot0.equals((Object)ringPlot1));
      assertFalse(boolean0);
      assertEquals(0.2, ringPlot1.getSectionDepth(), 0.01);
      assertTrue(ringPlot1.getSeparatorsVisible());
      assertEquals(0.2, ringPlot1.getInnerSeparatorExtension(), 0.01);
  }
}
