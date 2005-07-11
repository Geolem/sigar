package net.hyperic.sigar;

import java.util.List;
import java.util.Map;

/**
 * The proxyable interface for caching via SigarProxyCache.
 * This interface includes all methods which leave java land and 
 * gather info from the system.  All other accessors, such as the objects
 * returned by these methods do not leave java land.
 */
public interface SigarProxy {

    public long getPid();

    public long getServicePid(String name) throws SigarException;

    public Mem getMem() throws SigarException;

    public Swap getSwap() throws SigarException;

    public Cpu getCpu() throws SigarException;

    public CpuPerc getCpuPerc() throws SigarException;

    public Uptime getUptime() throws SigarException;

    public ResourceLimit getResourceLimit() throws SigarException;

    public double[] getLoadAverage() throws SigarException;

    public long[] getProcList() throws SigarException;

    public ProcStat getProcStat() throws SigarException;

    public ProcMem getProcMem(long pid) throws SigarException;

    public ProcMem getProcMem(String pid) throws SigarException;

    public ProcMem getMultiProcMem(String query) throws SigarException;

    public ProcState getProcState(long pid) throws SigarException;

    public ProcState getProcState(String pid) throws SigarException;

    public ProcTime getProcTime(long pid) throws SigarException;

    public ProcTime getProcTime(String pid) throws SigarException;

    public ProcCpu getProcCpu(long pid) throws SigarException;

    public ProcCpu getProcCpu(String pid) throws SigarException;

    public MultiProcCpu getMultiProcCpu(String query) throws SigarException;

    public ProcCred getProcCred(long pid) throws SigarException;

    public ProcCred getProcCred(String pid) throws SigarException;

    public ProcCredName getProcCredName(long pid) throws SigarException;

    public ProcCredName getProcCredName(String pid) throws SigarException;

    public ProcFd getProcFd(long pid) throws SigarException;

    public ProcFd getProcFd(String pid) throws SigarException;

    public ProcExe getProcExe(long pid) throws SigarException;

    public ProcExe getProcExe(String pid) throws SigarException;

    public String[] getProcArgs(long pid) throws SigarException;

    public String[] getProcArgs(String pid) throws SigarException;

    public Map getProcEnv(long pid) throws SigarException;

    public Map getProcEnv(String pid) throws SigarException;

    public String getProcEnv(long pid, String key) throws SigarException;

    public String getProcEnv(String pid, String key) throws SigarException;

    public List getProcModules(long pid) throws SigarException;

    public List getProcModules(String pid) throws SigarException;

    public long getProcPort(int protocol, long port) throws SigarException;

    public long getProcPort(String protocol, String port) throws SigarException;

    public FileSystem[] getFileSystemList() throws SigarException;

    public FileSystemMap getFileSystemMap() throws SigarException;

    public FileSystemUsage getMountedFileSystemUsage(String name)
        throws SigarException;

    public FileSystemUsage getFileSystemUsage(String name)
        throws SigarException;

    public FileInfo getFileInfo(String name) throws SigarException;

    public FileInfo getLinkInfo(String name) throws SigarException;

    public DirStat getDirStat(String name) throws SigarException;

    public CpuInfo[] getCpuInfoList() throws SigarException;

    public Cpu[] getCpuList() throws SigarException;

    public CpuPerc[] getCpuPercList() throws SigarException;

    public NetRoute[] getNetRouteList() throws SigarException;

    public NetInterfaceConfig getNetInterfaceConfig(String name)
        throws SigarException;

    public NetInterfaceStat getNetInterfaceStat(String name)
        throws SigarException;

    public String[] getNetInterfaceList() throws SigarException;

    public NetStat getNetStat() throws SigarException;

    public Who[] getWhoList() throws SigarException;

    public NetInfo getNetInfo() throws SigarException;

    public String getFQDN() throws SigarException;
}
