package scala.tools.nsc.substitutions;

final class Target_scala_reflect_internal_util_StatisticsStatics {
   static boolean areSomeHotStatsEnabled() {
     return false;
   }
   static boolean areSomeColdStatsEnabled() {
     return false;
   }

  public static void enableColdStats() {
    throw new RuntimeException("Operation unsupported enable cold stats in native scala compiler.");
  }

  public static void disableColdStats() {
    throw new RuntimeException("Operation disable cold stats is unsupported in native scala compiler.");
  }

  public static void enableHotStats() {
    throw new RuntimeException("Operation enable hot stats is unsupported in native scala compiler.");
  }

  public static void disableHotStats() {
    throw new RuntimeException("Operation disable hot stats is unsupported in native scala compiler.");
  }

}
