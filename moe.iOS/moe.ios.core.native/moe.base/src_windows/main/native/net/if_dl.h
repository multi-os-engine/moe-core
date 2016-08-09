#ifndef NET_IF_DL_H
#define NET_IF_DL_H

struct sockaddr_dl {
	u_char sdl_len;
	u_char sdl_family;
	u_short	sdl_index;
	u_char sdl_type;
	u_char sdl_nlen;
	u_char sdl_alen;
	u_char sdl_slen;
	char sdl_data[12];
};

#define LLADDR(s) ((void*)((s)->sdl_data + (s)->sdl_nlen))

#endif
