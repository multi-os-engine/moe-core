#ifndef PWD_H
#define PWD_H

struct passwd {
	char* pw_name;
	uid_t pw_uid;
	gid_t pw_gid;
	char* pw_shell;
	char* pw_dir;
};

#endif
