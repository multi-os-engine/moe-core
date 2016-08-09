#ifndef POLL_H
#define POLL_H

typedef unsigned int nfds_t;

// This is not going to work for a lot of kind of file descriptors, like pipes.
MOE_WINDOWS_INTERNAL int poll (struct pollfd * fds, nfds_t nfds, int timeout) {
	return WSAPoll((PWSAPOLLFD)fds, nfds, timeout);
}

#endif
