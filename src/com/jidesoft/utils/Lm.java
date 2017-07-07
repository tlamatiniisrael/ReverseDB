/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jidesoft.utils;

//import com.jidesoft.converter.CalendarConverter;
//import com.jidesoft.icons.JideIconsFactory;
//import com.jidesoft.plaf.UIDefaultsLookup;
//import com.jidesoft.swing.JideSwingUtilities;
//import com.jidesoft.swing.PopupWindow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.Beans;
import java.io.PrintStream;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

public final class Lm
  implements ProductNames
{
  private static Logger a = Logger.getLogger(Lm.class.getName());
  /**
   * @deprecated
   */
  public static final boolean DEBUG = false;
  /**
   * @deprecated
   */
  public static final boolean DOC_DEBUG = false;
  /**
   * @deprecated
   */
  public static final boolean CM_DEBUG = false;
  /**
   * @deprecated
   */
  public static final boolean RA_DEBUG = false;
  /**
   * @deprecated
   */
  public static final boolean ID_DEBUG = false;
  /**
   * @deprecated
   */
  public static final boolean PG_DEBUG = false;
  /**
   * @deprecated
   */
  public static final boolean CB_DEBUG = false;
  /**
   * @deprecated
   */
  public static final boolean HG_DEBUG = false;
  /**
   * @deprecated
   */
  public static final boolean AF_DEBUG = false;
  /**
   * @deprecated
   */
  public static final boolean BP_DEBUG = false;
  public static final boolean DOCK_DEBUG = false;
  public static final boolean DOCK_ID_DEBUG = false;
  public static final boolean ACTION_DEBUG = false;
  public static final boolean COMPONENT_DEBUG = false;
  public static final boolean PROPERTY_TABLE_DEBUG = false;
  public static final boolean COMBOBOX_DEBUG = false;
  public static final boolean BEAN_INTROSPECTOR_DEBUG = false;
  public static final boolean DEMO = false;
  private static boolean b = false;
  private static int c = 0;
  private static JFrame d;
  private static final Calendar e = Calendar.getInstance();
  private static int f = 0;
  private static boolean g = false;
  private static int h = 0;
  private static String i = null;
  private static String j = null;
  private static final String[] k = { "Docking", "Component", "Grid", "Dialog", "Action", "Shortcut", "Pivot", "CodeEditor", "FeedReader", "Dashboard", "Data", "Charts", "Gantt", "Diff", "TreeMap", "JDAF" };
  private static final BigInteger l = new BigInteger("21", 10);
  private static final BigInteger m = new BigInteger("305508269643653255827856366547026610628423058227532461973", 10);
  public static int n;
  
  public static String getProductVersion()
  {
    return "3.6.18";
  }
  
  public static boolean showDemoMessageBoxDocking()
  {
    boolean bool = Q.a;
    c += 1;
    if (!bool) {
      if (c != 0)
      {
        if (bool) {
          break label43;
        }
        if (c % 20 == 0)
        {
          b = false;
          z();
        }
      }
    }
    label43:
    return false;
  }
  
  public static void showAboutMessageBox()
  {
    b = false;   // muestra una ventana
    z();
  }
  
  private static String a(int paramInt)
  {
    boolean bool = Q.a;
    StringBuffer localStringBuffer = new StringBuffer();
    if (!bool) {
      if (paramInt == 0) {
        return "";
      }
    }
    if (!bool) {
      if ((paramInt & 0x1) != 0) {
        localStringBuffer.append("JIDE Docking Framework, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x2) != 0) {
        localStringBuffer.append("JIDE Components, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x4) != 0) {
        localStringBuffer.append("JIDE Grids, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x8) != 0) {
        localStringBuffer.append("JIDE Dialogs, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x10) != 0) {
        localStringBuffer.append("JIDE Action Framework, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x40) != 0) {
        localStringBuffer.append("JIDE Shortcut Editor, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x20) != 0) {
        localStringBuffer.append("JIDE Pivot Grid, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x80) != 0) {
        localStringBuffer.append("JIDE Code Editor, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x100) != 0) {
        localStringBuffer.append("JIDE Feed Reader, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x400) != 0) {
        localStringBuffer.append("JIDE Dashboard, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x800) != 0) {
        localStringBuffer.append("JIDE Data Grids, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x1000) != 0) {
        localStringBuffer.append("JIDE Charts, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x2000) != 0) {
        localStringBuffer.append("JIDE Gantt Chart, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x4000) != 0) {
        localStringBuffer.append("JIDE Diff, ");
      }
    }
    if (!bool) {
      if ((paramInt & 0x8000) != 0) {
        localStringBuffer.append("JIDE TreeMap, ");
      }
    }
    if ((paramInt & 0x200) != 0) {
      localStringBuffer.append("JIDE Desktop Application Framework, ");
    }
    String str = new String(localStringBuffer);
    return str.substring(0, str.length() - 2);
  }
  
  protected static String getProductName(int[] paramArrayOfInt)
  {
    boolean bool = Q.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = 0;
    do
    {
      if (i1 >= paramArrayOfInt.length) {
        break;
      }
      int i2 = paramArrayOfInt[i1];
      if (!bool)
      {
        if (i2 == 1) {
          localStringBuffer.append(k[i1]);
        }
        i1++;
      }
    } while (!bool);
    return localStringBuffer.toString();
  }
  
  public static void showInvalidProductMessage(String paramString, int paramInt)
  {
    boolean bool = Q.a;
    if (!bool) {
      if (h == 0)
      {
        if ((!bool) && (g)) {
          return;
        }
        if (!bool) {
          if ("true".equals(SecurityUtils.getProperty("jide.verifyLicense", "false")))
          {
            System.err.println("Verifying " + paramString);
            Thread.dumpStack();
          }
        }
        if ((bool) || ((!Beans.isDesignTime()) && (Beans.isGuiAvailable())))
        {
          a("<html><font size=3><b>Unauthorized usage of JIDE products</b></font><br><br><hr size='1'><br>You get this message box is because you didn't input a correct license key.<br>If you see this message box in one of our demo examples, just ignore it. If you wish to use JIDE products in <br>your application, please contact sales@jidesoft.com.</html>", "JIDE Software, Inc.", -1, "Click to Continue");
          if (!bool) {}
        }
        else
        {
          System.out.println("Unauthorized usage of JIDE products\nYou get this message is because you didn't input a correct license key.\nIf you see this message box in one of our demo examples, just ignore it.\nIf you wish to use JIDE products in your application, please contact sales@jidesoft.com.");
        }
        g = true;
        if (!bool) {
          return;
        }
      }
    }
    if ((bool) || ((f & paramInt) == 0))
    {
      if (!bool) {
        if ("true".equals(SecurityUtils.getProperty("jide.verifyLicense", "false")))
        {
          System.err.println("Verifying " + paramString + " for " + paramInt);
          Thread.dumpStack();
        }
      }
      String str1 = a(paramInt);
      String str2 = a(h);
      if ((bool) || ((!Beans.isDesignTime()) && (Beans.isGuiAvailable())))
      {
        a("<html><font size=3><b>Unauthorized usage of JIDE products</b></font><br><br><hr size='1'><br>You get this message box is because the license key(s) are for " + str2 + " only.<br>" + "The class " + paramString + " you tried to use is part of " + str1 + ".<br>If you wish to use " + str1 + " in your application, please contact sales@jidesoft.com.</html>", "JIDE Software, Inc.", -1, "Click to Continue");
        if (!bool) {}
      }
      else
      {
        System.out.println("Unauthorized usage of JIDE products\nYou get this message is because the license key(s) are for " + str2 + " only.\n" + "The class " + paramString + " you tried to use is part of " + str1 + ".\nIf you wish to use " + str1 + " in your application, please contact sales@jidesoft.com.");
      }
      f |= paramInt;
    }
  }
  
  private static void a()
  {
    boolean bool = Q.a;
    if (h == 0) {
      b();
    }
    Calendar localCalendar = Calendar.getInstance();
    String str = "JIDE Docking Framework, JIDE Action Framework, JIDE Components, JIDE Grids, JIDE Dialogs, JIDE Pivot Grid, JIDE Shortcut Editor, JIDE Code Editor, JIDE Feed Reader, JIDE Dashboard, JIDE Data Grids, JIDE Charts, JIDE Gantt Chart, and JIDE Diff";
    int i1 = str.indexOf(",", str.length() / 2);
    str = str.substring(0, i1 + 1) + "<BR>" + str.substring(i1 + 1) + "<BR>" + getProductVersion();
    if (!bool) {
      if (h == 0)
      {
        if (bool) {
          break label220;
        }
        if (localCalendar.after(e))
        {
          a("<html><font size=3><b>Demo for " + str + "</b></font><br><br>" + "Copyright (c) 2002-" + new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()) + " JIDE Software, Inc, all rights reserved.<br><br><hr size='1'><br>" + "<font color='red'><b>This demo version has expired on " + DateFormat.getDateInstance(1).format(e.getTime()) + ".</b></font>" + "<br>If you want to continue evaluating, please download it again from http://www.jidesoft.com." + "<br><br><b>" + "Please Note: This release package is for evaluation purpose only. Distribution of it is strictly prohibited. If you wish to use any JIDE products in your application, please contact sales@jidesoft.com.</html>", "JIDE Software, Inc.", -1, "Click to Exit");
          System.exit(0);
          if (!bool) {
            return;
          }
        }
      }
    }
    label220:
    if ((bool) || (!b))
    {
      if ((bool) || ((!Beans.isDesignTime()) && (Beans.isGuiAvailable())))
      {
        if (!bool) {}
        a("<html><font size=3><b>Demo for " + str + "</b></font><br><br>" + "Copyright (c) 2002-" + new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()) + " JIDE Software, Inc, all rights reserved.<br><br><hr size='1'><br>" + "This is an evaluation version of JIDE products " + (h == 0 ? ". It will expire on " + DateFormat.getDateInstance(1).format(e.getTime()) : new StringBuilder().append("that is temporarily licensed to <b>").append(i).append("</b> for ").append(j).toString()) + ".<br><br><b>" + "Please Note: This release package is for evaluation purpose only. Distribution of it is strictly prohibited.<br> " + "If you wish to use any JIDE products in your application, please contact sales@jidesoft.com. If you already purchased, please download the formal release package to get rid of this message box.</html>", "JIDE Software, Inc.", -1, "Continue to Evaluate");
        if (!bool) {}
      }
      else
      {
        if (!bool) {}
        System.out.println("Demo for JIDE Docking Framework, JIDE Action Framework, JIDE Components, JIDE Grids, JIDE Dialogs, JIDE Pivot Grid, JIDE Shortcut Editor, JIDE Code Editor, JIDE Feed Reader, JIDE Dashboard, JIDE Data Grids, JIDE Charts, JIDE Gantt Chart, and JIDE Diff\n\nCopyright (c) 2002-" + new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()) + " JIDE Software, Inc, all rights reserved.\n\n---------\n" + "This is an evaluation version of JIDE products " + (h == 0 ? ". It will expire on " + DateFormat.getDateInstance(1).format(e.getTime()) : new StringBuilder().append("that is temporarily licensed to <b>").append(i).append(" for ").append(j).toString()) + ".\n\nPlease Note: This release package is for evaluation purpose only. Distribution of it is strictly prohibited.\n " + "If you wish to use any JIDE products in your application, please contact sales@jidesoft.com. If you already purchased, please download the formal release package to get rid of this message box.");
      }
      b = true;
    }
  }
  
  public static void z() {}
  
  private static String a(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString1);
    localStringBuffer.append(":");
    localStringBuffer.append(paramString2);
    localStringBuffer.append(":");
    localStringBuffer.append(paramInt1);
    if (!Q.a)
    {
      if (paramInt2 != 0) {
        localStringBuffer.append(":");
      }
    }
    else {
      localStringBuffer.append(paramInt2);
    }
    return new String(localStringBuffer);
  }
  
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString1);
    localStringBuffer.append(":");
    localStringBuffer.append(paramString2);
    localStringBuffer.append(":");
    localStringBuffer.append(paramString3);
    return new String(localStringBuffer);
  }
  
  private static int a(String paramString)
  {
    boolean bool = Q.a;
    int i1 = 0;
    if (!bool) {
      if (paramString.indexOf("Docking") != -1) {
        i1 |= 0x1;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Component") != -1) {
        i1 |= 0x2;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Grid") != -1) {
        i1 |= 0x4;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Dialog") != -1) {
        i1 |= 0x8;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Action") != -1) {
        i1 |= 0x10;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Shortcut") != -1) {
        i1 |= 0x40;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Pivot") != -1) {
        i1 |= 0x20;
      }
    }
    if (!bool) {
      if (paramString.indexOf("CodeEditor") != -1) {
        i1 |= 0x80;
      }
    }
    if (!bool) {
      if (paramString.indexOf("FeedReader") != -1) {
        i1 |= 0x100;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Dashboard") != -1) {
        i1 |= 0x400;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Data") != -1) {
        i1 |= 0x800;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Charts") != -1) {
        i1 |= 0x1000;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Gantt") != -1) {
        i1 |= 0x2000;
      }
    }
    if (!bool) {
      if (paramString.indexOf("Diff") != -1) {
        i1 |= 0x4000;
      }
    }
    if (!bool)
    {
      if (paramString.indexOf("TreeMap") != -1) {
        i1 |= 0x8000;
      }
      if (bool) {}
    }
    else if (paramString.indexOf("JDAF") != -1)
    {
      i1 |= 0x200;
    }
    return i1;
  }
  
  static boolean b(int paramInt)
  {
    boolean bool = Q.a;
    if (!bool) {
      if (h == 0)
      {
        if ((bool) || (a.isLoggable(Level.FINE))) {
          a.fine("No license key is input, try to get it from resource file or system property");
        }
        b();
      }
    }
    System.out.println("******* h "+h);
    System.out.println("******* paramint "+paramInt);
    if ((bool) || ((h & paramInt) != 0)) {
      if (bool) {}
    }
    return !"Evaluation Purpose Only".equals(j);
  }
  
  public static void verifyLicense(String paramString1, String paramString2, String paramString3)
  {
    if ((Q.a) || (a.isLoggable(Level.FINE))) {
      a.fine("Verify license key: " + paramString1 + " + " + paramString2 + " + " + paramString3);
    }
    b(paramString1, paramString2, paramString3);
  }
  
  private static void b()
  {
    boolean bool = Q.a;
    ResourceBundle localResourceBundle = null;
    try
    {
      localResourceBundle = ResourceBundle.getBundle("com.jidesoft.utils.utils");
    }
    catch (Exception localException1) {}
    if (localResourceBundle == null) {
      try
      {
        ClassLoader localClassLoader = Thread.currentThread().getContextClassLoader();
        if (localClassLoader != null) {
          localResourceBundle = ResourceBundle.getBundle("com.jidesoft.utils.utils", Locale.getDefault(), localClassLoader);
        }
      }
      catch (Exception localException2)
      {
        if (!bool) {
          break label76;
        }
      }
    } else if ((bool) || (a.isLoggable(Level.FINE))) {
      a.fine("Retrieved license key from the resource file");
    }
    try
    {
      label76:
      String str1 = (bool) || (localResourceBundle != null) ? localResourceBundle.getString("verifyLicense.companyName") : SecurityUtils.getProperty("verifyLicense.companyName", null);
      if (((!bool) && (str1 == null)) || ((bool) || (str1.trim().length() == 0)))
      {
        if ((bool) || (a.isLoggable(Level.FINE))) {
          a.fine("Company name is empty");
        }
        return;
      }
      String str2 = (bool) || (localResourceBundle != null) ? localResourceBundle.getString("verifyLicense.projectName") : SecurityUtils.getProperty("verifyLicense.projectName", null);
      if (((!bool) && (str2 == null)) || ((bool) || (str2.trim().length() == 0)))
      {
        if ((bool) || (a.isLoggable(Level.FINE))) {
          a.fine("Product name is empty");
        }
        return;
      }
      String str3 = (bool) || (localResourceBundle != null) ? localResourceBundle.getString("verifyLicense.licenseKey") : SecurityUtils.getProperty("verifyLicense.licenseKey", null);
      if ((bool) || (str3 != null))
      {
        if (bool) {
          break label302;
        }
        if (str3.trim().length() != 0) {}
      }
      else
      {
        if ((bool) || (a.isLoggable(Level.FINE))) {
          a.fine("License key is empty");
        }
        return;
      }
      label302:
      b(str1, str2, str3);
    }
    catch (Exception localException3) {}
  }
  
  private static void b(String paramString1, String paramString2, String paramString3)
  {
      System.out.println("******** EN B");
    boolean bool = Q.a;
    if ((bool) || (a.isLoggable(Level.FINE))) {
      a.fine("Verifying ...");
    }
    if ((bool) || (paramString1 != null))
    {
      if (bool) {
        break label116;
      }
      if ((paramString1.trim().length() != 0) && ((bool) || (paramString2 != null)))
      {
        if (bool) {
          break label116;
        }
        if ((paramString2.trim().length() != 0) && ((bool) || (paramString3 != null)))
        {
          if (bool) {
            break label144;
          }
          if (paramString3.trim().length() != 0) {
            break label128;
          }
        }
      }
    }
    if ((bool) || (a.isLoggable(Level.FINE))) {
      label116:
      a.fine("Verify failed as one of the names are null");
    }
    return;
    label128:
    paramString1 = paramString1.trim();
    paramString2 = paramString2.trim();
    label144:
    if (!bool) {
      if (paramString2.startsWith("Trial"))
      {
        localObject1 = paramString2.substring("Trial".length()).trim();
        if (bool) {
          break label323;
        }
        if (((String)localObject1).length() > 0)
        {
          localObject2 = new CalendarConverter().fromString((String)localObject1, null);
          if (bool) {
            break label323;
          }
          if ((localObject2 instanceof Calendar))
          {
            if (bool) {
              break label323;
            }
            if (Calendar.getInstance().after((Calendar)localObject2))
            {
              a("<html><font size=3><b>Trial Version for JIDE Products</b></font><br><br>Copyright (c) 2002-" + new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()) + " JIDE Software, Inc, all rights reserved.<br><br><hr size='1'><br>" + "<font color='red'><b>This trial version has expired on " + DateFormat.getDateInstance(1).format(((Calendar)localObject2).getTime()) + ".</b></font>" + "<br>If you want to continue evaluating, please email sales@jidesoft.com to extend your trial license." + "<br><br><b>Please Note: This release package is for trial purpose only. Distribution of it is strictly prohibited.<br> " + "If you wish to use any JIDE products in your application, please contact sales@jidesoft.com.</html>", "JIDE Software, Inc.", -1, "Click to Exit");
              System.exit(0);
            }
          }
        }
      }
    }
    label323:
    Object localObject1 = new int[k.length];
    Arrays.fill((int[])localObject1, 0);
    Object localObject2 = b(paramString3);
    BigInteger localBigInteger = ((BigInteger)localObject2).modPow(l, m);
    if (!bool) {
      if (b(paramString1, paramString2, (int[])localObject1, localBigInteger)) {
        return;
      }
    }
    if (!bool) {
      if (a(paramString1, paramString2, (int[])localObject1, localBigInteger)) {
        return;
      }
    }
    int i1 = 15;
    label537:
    do
    {
      if (i1 < 0) {
        break;
      }
      if (bool) {
        break label559;
      }
      int i2 = 7;
      do
      {
        if (i2 < 0) {
          break label537;
        }
        int i3 = c(a(paramString1, paramString2, i1, i2 * 16));
        if (!bool)
        {
          if (bool) {
            break;
          }
          if (localBigInteger.equals(new BigInteger("" + i3)))
          {
            h |= i1 + i2 * 16;
            if ((bool) || (a.isLoggable(Level.FINE))) {
              a.fine("Verified (old way): " + h);
            }
            return;
          }
          i2--;
        }
      } while (!bool);
      i1--;
    } while (!bool);
    if ((bool) || (a.isLoggable(Level.FINE))) {
      label559:
      a.fine("Verify failed");
    }
  }
  
  private static boolean a(String paramString1, String paramString2, int[] paramArrayOfInt, BigInteger paramBigInteger)
  {
    boolean bool = Q.a;
    paramArrayOfInt[0] = 1;
    label290:
    label310:
    label323:
    label336:
    label349:
    label362:
    label375:
    label388:
    label401:
    label413:
    label425:
    label437:
    label449:
    label461:
    label473:
    do
    {
      if (paramArrayOfInt[0] < 0) {
        break;
      }
      paramArrayOfInt[1] = 1;
      do
      {
        if (paramArrayOfInt[1] < 0) {
          break;
        }
        if (bool) {
          break label473;
        }
        paramArrayOfInt[2] = 1;
        do
        {
          if (paramArrayOfInt[2] < 0) {
            break;
          }
          if (bool) {
            break label461;
          }
          paramArrayOfInt[3] = 1;
          do
          {
            if (paramArrayOfInt[3] < 0) {
              break;
            }
            if (bool) {
              break label449;
            }
            paramArrayOfInt[4] = 1;
            do
            {
              if (paramArrayOfInt[4] < 0) {
                break;
              }
              if (bool) {
                break label437;
              }
              paramArrayOfInt[5] = 1;
              do
              {
                if (paramArrayOfInt[5] < 0) {
                  break;
                }
                if (bool) {
                  break label425;
                }
                paramArrayOfInt[6] = 1;
                do
                {
                  if (paramArrayOfInt[6] < 0) {
                    break;
                  }
                  if (bool) {
                    break label413;
                  }
                  paramArrayOfInt[7] = 1;
                  do
                  {
                    if (paramArrayOfInt[7] < 0) {
                      break;
                    }
                    if (bool) {
                      break label401;
                    }
                    paramArrayOfInt[8] = 1;
                    do
                    {
                      if (paramArrayOfInt[8] < 0) {
                        break;
                      }
                      if (bool) {
                        break label388;
                      }
                      paramArrayOfInt[9] = 1;
                      do
                      {
                        if (paramArrayOfInt[9] < 0) {
                          break;
                        }
                        if (bool) {
                          break label375;
                        }
                        paramArrayOfInt[10] = 1;
                        do
                        {
                          if (paramArrayOfInt[10] < 0) {
                            break;
                          }
                          if (bool) {
                            break label362;
                          }
                          paramArrayOfInt[11] = 1;
                          do
                          {
                            if (paramArrayOfInt[11] < 0) {
                              break;
                            }
                            if (bool) {
                              break label349;
                            }
                            paramArrayOfInt[12] = 1;
                            do
                            {
                              if (paramArrayOfInt[12] < 0) {
                                break;
                              }
                              if (bool) {
                                break label336;
                              }
                              paramArrayOfInt[13] = 1;
                              do
                              {
                                if (paramArrayOfInt[13] < 0) {
                                  break;
                                }
                                if (bool) {
                                  break label323;
                                }
                                paramArrayOfInt[14] = 1;
                                do
                                {
                                  if (paramArrayOfInt[14] < 0) {
                                    break;
                                  }
                                  if (bool) {
                                    break label310;
                                  }
                                  paramArrayOfInt[15] = 1;
                                  do
                                  {
                                    if (paramArrayOfInt[15] < 0) {
                                      break label290;
                                    }
                                    if (bool) {
                                      break;
                                    }
                                    if ((bool) || (c(paramString1, paramString2, paramArrayOfInt, paramBigInteger))) {
                                      return true;
                                    }
                                    paramArrayOfInt[15] -= 1;
                                  } while (!bool);
                                  paramArrayOfInt[14] -= 1;
                                } while (!bool);
                                paramArrayOfInt[13] -= 1;
                              } while (!bool);
                              paramArrayOfInt[12] -= 1;
                            } while (!bool);
                            paramArrayOfInt[11] -= 1;
                          } while (!bool);
                          paramArrayOfInt[10] -= 1;
                        } while (!bool);
                        paramArrayOfInt[9] -= 1;
                      } while (!bool);
                      paramArrayOfInt[8] -= 1;
                    } while (!bool);
                    paramArrayOfInt[7] -= 1;
                  } while (!bool);
                  paramArrayOfInt[6] -= 1;
                } while (!bool);
                paramArrayOfInt[5] -= 1;
              } while (!bool);
              paramArrayOfInt[4] -= 1;
            } while (!bool);
            paramArrayOfInt[3] -= 1;
          } while (!bool);
          paramArrayOfInt[2] -= 1;
        } while (!bool);
        paramArrayOfInt[1] -= 1;
      } while (!bool);
      paramArrayOfInt[0] -= 1;
    } while (!bool);
    return false;
  }
  
  private static boolean b(String paramString1, String paramString2, int[] paramArrayOfInt, BigInteger paramBigInteger)
  {
    boolean bool = Q.a;
    Arrays.fill(paramArrayOfInt, 1);
    if (!bool)
    {
      if (c(paramString1, paramString2, paramArrayOfInt, paramBigInteger)) {
        return true;
      }
      Arrays.fill(paramArrayOfInt, 0);
      paramArrayOfInt[0] = 1;
      paramArrayOfInt[1] = 1;
    }
    if (!bool)
    {
      if (c(paramString1, paramString2, paramArrayOfInt, paramBigInteger)) {
        return true;
      }
      paramArrayOfInt[2] = 1;
      paramArrayOfInt[3] = 1;
      paramArrayOfInt[4] = 1;
    }
    if (!bool) {
      if (c(paramString1, paramString2, paramArrayOfInt, paramBigInteger)) {
        return true;
      }
    }
    int i1 = 0;
    do
    {
      if (i1 >= paramArrayOfInt.length) {
        break;
      }
      Arrays.fill(paramArrayOfInt, 0);
      paramArrayOfInt[i1] = 1;
      if (!bool)
      {
        if (bool) {
          break label157;
        }
        if (c(paramString1, paramString2, paramArrayOfInt, paramBigInteger)) {
          return true;
        }
        i1++;
      }
    } while (!bool);
    Arrays.fill(paramArrayOfInt, 0);
    paramArrayOfInt[2] = 1;
    paramArrayOfInt[6] = 1;
    label157:
    if (!bool) {
      if (c(paramString1, paramString2, paramArrayOfInt, paramBigInteger)) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean c(String paramString1, String paramString2, int[] paramArrayOfInt, BigInteger paramBigInteger)
  {
    boolean bool = Q.a;
    String str = getProductName(paramArrayOfInt);
    int i1 = d(a(paramString1, paramString2, str));
    if (!bool) {
      if (paramBigInteger.equals(new BigInteger("" + i1)))
      {
        h |= a(str);
        i = paramString1;
        j = paramString2;
        if (!bool) {
          if (a.isLoggable(Level.FINE)) {
            a.fine("Verified: " + h);
          }
        }
        return true;
      }
    }
    return false;
  }
  
  public static void clearLicense()
  {
    if (!Q.a) {
      if (a.isLoggable(Level.FINE)) {
        a.fine("License key is cleared");
      }
    }
    h = 0;
  }
  
  private static BigInteger b(String paramString)
  {
    boolean bool = Q.a;
    BigInteger localBigInteger = BigInteger.ZERO;
    int i1 = paramString.length() - 1;
    label62:
    label98:
    label134:
    label199:
    label217:
    do
    {
      if (i1 < 0) {
        break;
      }
      int i2 = paramString.charAt(i1);
      int i3;
      if (!bool) {
        if (48 <= i2)
        {
          if (bool) {
            break label62;
          }
          if (i2 <= 57)
          {
            i3 = i2 - 48;
            if (!bool) {
              break label199;
            }
          }
        }
      }
      if (!bool) {
        if (65 <= i2)
        {
          if (bool) {
            break label98;
          }
          if (i2 <= 90)
          {
            i3 = i2 - 65 + 10;
            if (!bool) {
              break label199;
            }
          }
        }
      }
      if (!bool) {
        if (97 <= i2)
        {
          if (bool) {
            break label134;
          }
          if (i2 <= 122)
          {
            i3 = i2 - 97 + 36;
            if (!bool) {
              break label199;
            }
          }
        }
      }
      if (!bool) {
        if (i2 == 46)
        {
          i3 = 62;
          if (!bool) {
            break label199;
          }
        }
      }
      if ((bool) || (i2 == 58))
      {
        i3 = 63;
        if (!bool) {}
      }
      else
      {
        System.err.println("incorrect char:" + i2);
        break label217;
      }
      localBigInteger = localBigInteger.shiftLeft(6);
      localBigInteger = localBigInteger.add(BigInteger.valueOf(i3));
      i1--;
    } while (!bool);
    return localBigInteger;
  }
  
  private static int c(String paramString)
  {
    boolean bool = Q.a;
    int i1 = 1976;
    int i2 = 0;
    do
    {
      if (i2 >= paramString.length()) {
        break;
      }
      i1 += paramString.charAt(i2);
      i1 += 666;
      if (bool) {
        break label50;
      }
      i1 ^= 0x7895;
      i2++;
    } while (!bool);
    label50:
    return i1;
  }
  
  private static int d(String paramString)
  {
    boolean bool = Q.a;
    int i1 = 1979;
    int i2 = 0;
    do
    {
      if (i2 >= paramString.length()) {
        break;
      }
      i1 += paramString.charAt(i2);
      i1 += 88888;
      if (bool) {
        break label48;
      }
      i1 ^= 0x31527B;
      i2++;
    } while (!bool);
    label48:
    return i1;
  }
  
  public static void setParent(JFrame paramJFrame)
  {
    d = paramJFrame;
  }
  
  private static void a(Object paramObject, String paramString, int paramInt)
  {
    a(paramObject, paramString, paramInt, null);
  }
  
  private static void a(Object paramObject, String paramString1, int paramInt, String paramString2)
  {
    boolean bool = Q.a;
    Object localObject;
    if ((bool) || (d == null))
    {
      localObject = new JFrame("JIDE Software, Inc.");
      ((JFrame)localObject).setIconImage(JideIconsFactory.getImageIcon("jide/jide32.png").getImage());
      ((JFrame)localObject).setLocation(0, Integer.MAX_VALUE);
      ((JFrame)localObject).pack();
      ((JFrame)localObject).setVisible(true);
      PortingUtils.notifyUser();
      ((JFrame)localObject).toFront();
      b_ localb_ = new b_((Frame)localObject, paramString1, paramObject.toString(), paramInt, paramString2);
      localb_.display(false);
      ((JFrame)localObject).setVisible(false);
      ((JFrame)localObject).dispose();
      if (!bool) {}
    }
    else
    {
      localObject = new b_(d, paramString1, paramObject.toString(), paramInt, paramString2);
      ((b_)localObject).display(false);
    }
  }
  
  public static void showPopupMessageBox(String paramString)
  {
    boolean bool = Q.a;
    PopupWindow localPopupWindow = new PopupWindow(d);
    JLabel localJLabel = new JLabel();
    localJLabel.setBackground(UIDefaultsLookup.getColor("ContentContainer.background"));
    localJLabel.setForeground(Color.black);
    localJLabel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black), BorderFactory.createEmptyBorder(3, 3, 3, 3)));
    localJLabel.setText(paramString);
    localPopupWindow.add(localJLabel);
    localPopupWindow.show(d, 100, 200);
    if (bool)
    {
      int i1 = n;
      i1++;
      n = i1;
    }
  }
  
  private static void c()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("JIDE Version: ").append("3.6.18");
    localStringBuffer.append("<BR>");
    localStringBuffer.append("JDK Version: ").append(SystemInfo.getJavaVersion());
    localStringBuffer.append("<BR>");
    localStringBuffer.append("JDK Vendor: ").append(SystemInfo.getJavaVendor());
    localStringBuffer.append("<BR>");
    localStringBuffer.append("Java Class Version: ").append(SystemInfo.getJavaClassVersion());
    localStringBuffer.append("<BR>");
    localStringBuffer.append("Platform: ").append(SystemInfo.getOS());
    localStringBuffer.append("<BR>");
    localStringBuffer.append("Platform Version: ").append(SystemInfo.getOSVersion());
    localStringBuffer.append("<BR>");
    localStringBuffer.append("Platform Architecture: ").append(SystemInfo.getOSArchitecture());
    localStringBuffer.append("<BR>");
    String str = localStringBuffer.toString();
    str = str.replaceAll("<BR>", "\n");
    System.out.println(str);
    a("<HTML>" + localStringBuffer + "</HTML>", "JIDE Products - System Information", -1);
  }
  
  public static void main(String[] paramArrayOfString) {}
  
  public static void getUIError(String paramString)
  {
    a("<HTML><B>Missing value in LookAndFeel's UIDefaults</B>. <BR><BR><HR><BR>Component \"<B>" + paramString + "</B>\" requires its own ComponentUI and additional values in LookAndFeel's UIDefaults.<BR>Please make sure you call LookAndFeelFactory.installJideExtension() whenever you switch L&F." + "<BR>For more details, please refer to Developer Guides or visit JIDE Developer's Forum (http://www.jidesoft.com/forum).\n", "LookAndFeel Error", -1, "  Exit  ");
    System.exit(-1);
  }
  
  static
  {
    e.set(2018, 4, 31, 0, 0, 0);
  }
  
  private static class a_
    extends JDialog
  {
    private boolean a = false;
    private b_ b = new b_(this);
    
    public a_()
      throws HeadlessException
    {
      this(null, "", true);
    }
    
    public a_(Frame paramFrame)
      throws HeadlessException
    {
      this(paramFrame, "", true);
    }
    
    public a_(Frame paramFrame, String paramString)
      throws HeadlessException
    {
      this(paramFrame, paramString, true);
    }
    
    public a_(Frame paramFrame, boolean paramBoolean)
      throws HeadlessException
    {
      this(paramFrame, "", paramBoolean);
    }
    
    public a_(Frame paramFrame, String paramString, boolean paramBoolean)
    {
      super(paramString, paramBoolean);
      getRootPane().registerKeyboardAction(this.b, KeyStroke.getKeyStroke(27, 0), 1);
      if (Lm.n != 0) {
        Q.a = !bool;
      }
    }
    
    public final boolean getResult()
    {
      return this.a;
    }
    
    public final void setResult(boolean paramBoolean)
    {
      this.a = paramBoolean;
    }
    
    public void display(boolean paramBoolean)
    {
      a(getRootPane());
      pack();
      setResizable(paramBoolean);
      JideSwingUtilities.globalCenterWindow(this);
      setVisible(true);
    }
    
    private void a(Component paramComponent)
    {
      boolean bool = Q.a;
      if ((bool) || ((paramComponent instanceof JButton))) {
        paramComponent.addFocusListener(new FocusAdapter()
        {
          public void focusGained(FocusEvent paramAnonymousFocusEvent)
          {
            Lm.a_.this.getRootPane().setDefaultButton((JButton)paramAnonymousFocusEvent.getSource());
          }
        });
      }
      Component[] arrayOfComponent = null;
      if (!bool) {
        if ((paramComponent instanceof JMenu))
        {
          arrayOfComponent = ((JMenu)paramComponent).getMenuComponents();
          break label74;
        }
      }
      if ((bool) || ((paramComponent instanceof Container))) {
        arrayOfComponent = ((Container)paramComponent).getComponents();
      }
      label74:
      if (arrayOfComponent != null)
      {
        int i = 0;
        do
        {
          if (i >= arrayOfComponent.length) {
            break;
          }
          a(arrayOfComponent[i]);
          i++;
        } while (!bool);
      }
    }
    
    public void display()
    {
      display(false);
    }
    
    public AbstractAction getDefaultCancelAction()
    {
      return this.b;
    }
    
    private class b_
      extends AbstractAction
    {
      private JDialog a;
      
      protected b_(JDialog paramJDialog)
      {
        super();
        this.a = paramJDialog;
      }
      
      public void actionPerformed(ActionEvent paramActionEvent)
      {
        Lm.a_.this.a = false;
        this.a.setVisible(false);
      }
    }
  }
  
  private static class b_
    extends Lm.a_
  {
    private String c;
    private int d;
    private String e;
    
    public b_(Frame paramFrame, String paramString1, String paramString2)
      throws HeadlessException
    {
      this(paramFrame, paramString1, paramString2, -1, null);
    }
    
    public b_(Frame paramFrame, String paramString1, String paramString2, int paramInt)
      throws HeadlessException
    {
      this(paramFrame, paramString1, paramString2, paramInt, null);
    }
    
    public b_(Frame paramFrame, String paramString1, String paramString2, int paramInt, String paramString3)
      throws HeadlessException
    {
      super(paramString1, true);
      this.c = paramString2;
      this.d = paramInt;
      this.e = paramString3;
      a();
    }
    
    private void a()
    {
      boolean bool = Q.a;
      JPanel localJPanel1 = new JPanel(new BorderLayout(6, 6));
      JButton localJButton = new JButton(getDefaultCancelAction());
      getRootPane().setDefaultButton(localJButton);
      if (!bool)
      {
        if (this.e != null) {
          localJButton.setText(this.e);
        }
        localJPanel1.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));
      }
      JLabel localJLabel1 = new JLabel(this.c);
      JPanel localJPanel2 = new JPanel(new BorderLayout(12, 12));
      JLabel localJLabel2;
      switch (this.d)
      {
      case 2: 
        localJLabel2 = new JLabel(UIDefaultsLookup.getIcon("OptionPane.warningIcon"));
        if (!bool) {
          break;
        }
      case 0: 
        localJLabel2 = new JLabel(UIDefaultsLookup.getIcon("OptionPane.errorIcon"));
        if (!bool) {
          break;
        }
      case 1: 
        localJLabel2 = new JLabel(UIDefaultsLookup.getIcon("OptionPane.informationIcon"));
        if (!bool) {
          break;
        }
      case 3: 
        localJLabel2 = new JLabel(UIDefaultsLookup.getIcon("OptionPane.questionIcon"));
        if (!bool) {
          break;
        }
      default: 
        localJLabel2 = new JLabel(JideIconsFactory.getImageIcon("jide/jide_logo.png"));
      }
      localJPanel2.add(JideSwingUtilities.createTopPanel(localJLabel2), "Before");
      localJPanel2.add(localJLabel1, "Center");
      localJPanel1.add(localJPanel2, "Center");
      localJPanel1.add(JideSwingUtilities.createCenterPanel(localJButton), "Last");
      getContentPane().add(localJPanel1);
    }
  }
}
