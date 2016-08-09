#ifndef SYS_UTSNAME_H
#define SYS_UTSNAME_H

#define	_SYS_NAMELEN 256

struct utsname {
	char sysname[_SYS_NAMELEN];
	char nodename[_SYS_NAMELEN];
	char release[_SYS_NAMELEN];
	char version[_SYS_NAMELEN];
	char machine[_SYS_NAMELEN];
};

MOE_WINDOWS_EXTERN_DECL int uname(struct utsname *);

#endif
