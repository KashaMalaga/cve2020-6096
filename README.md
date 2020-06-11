# cve2020-6096
 CVE 2020-6096 PoC - memcpy+168 still needed to build the RoP + shellcode
Base on article released from Talos (Cisco)

https://talosintelligence.com/vulnerability_reports/TALOS-2020-1019
https://blog.talosintelligence.com/2020/05/cve-2020-6096.html

2020-06-11 18:24:03.661 3569-3569/com.kasha.cve2020_6096 I/exploit: before memcpy
    --------- beginning of crash
2020-06-11 18:24:03.667 3569-3569/com.kasha.cve2020_6096 A/libc: Fatal signal 11 (SIGSEGV), code 1 (SEGV_MAPERR), fault addr 0xbeda5000 in tid 3569 (kasha.cve2020_6096), pid 3569 (kasha.cve2020_6096)
2020-06-11 18:24:03.796 3596-3596/? I/crash_dump32: obtaining output fd from tombstoned, type: kDebuggerdTombstone
2020-06-11 18:24:03.801 655-655/? I//system/bin/tombstoned: received crash request for pid 3569
2020-06-11 18:24:03.803 3596-3596/? I/crash_dump32: performing dump of process 3569 (target tid = 3569)
2020-06-11 18:24:03.840 3596-3596/? A/DEBUG: *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
2020-06-11 18:24:03.841 3596-3596/? A/DEBUG: Build fingerprint: 'Xiaomi/baiji_sw/baiji:9/PXD7.200315.001.XM067/PXD7.200315.001.XM067:user/release-keys'
2020-06-11 18:24:03.841 3596-3596/? A/DEBUG: Revision: '0'
2020-06-11 18:24:03.841 3596-3596/? A/DEBUG: ABI: 'arm'
2020-06-11 18:24:03.841 3596-3596/? A/DEBUG: pid: 3569, tid: 3569, name: kasha.cve2020_6096  >>> framework/wear-service.jar <<<
2020-06-11 18:24:03.841 3596-3596/? A/DEBUG: signal 11 (SIGSEGV), code 1 (SEGV_MAPERR), fault addr 0xbeda5000
2020-06-11 18:24:03.841 3596-3596/? A/DEBUG:     r0  beda4bf0  r1  beda4ff0  r2  ffffb66b  r3  0000000c
2020-06-11 18:24:03.841 3596-3596/? A/DEBUG:     r4  ae80c140  r5  00000001  r6  00000000  r7  beda0d88
2020-06-11 18:24:03.841 3596-3596/? A/DEBUG:     r8  00000000  r9  b4c36000  r10 00000000  r11 beda0e8c
2020-06-11 18:24:03.841 3596-3596/? A/DEBUG:     ip  80000000  sp  beda0560  lr  9a2e2277  pc  b1b2cf30
2020-06-11 18:24:03.843 3596-3596/? A/DEBUG: backtrace:
2020-06-11 18:24:03.843 3596-3596/? A/DEBUG:     #00 pc 00019f30  /system/lib/libc.so (memcpy+168)
2020-06-11 18:24:03.843 3596-3596/? A/DEBUG:     #01 pc 00008273  /data/app/com.kasha.cve2020_6096-kfUxk3DHgl4VQuPaayxvpw==/base.apk (offset 0x1000) (do_memcpy()+78)
2020-06-11 18:24:03.843 3596-3596/? A/DEBUG:     #02 pc 00000001  <unknown>
2020-06-11 18:24:05.758 655-655/? E//system/bin/tombstoned: Tombstone written to: /data/tombstones/tombstone_04
2020-06-11 18:24:05.813 1645-1664/? I/BootReceiver: Copying /data/tombstones/tombstone_04 to DropBox (SYSTEM_TOMBSTONE)
2020-06-11 18:24:05.829 440-440/? I/Zygote: Process 3569 exited due to signal (11)
2020-06-11 18:24:05.834 1645-3599/? W/ActivityManager:   Force finishing activity com.kasha.cve2020_6096/.MainActivity
